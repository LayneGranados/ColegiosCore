package com.gapxgestioncolegiosweb.controllers;

import com.gapxgestioncolegiosweb.business.SedeBusiness;
import com.gapxgestioncolegiosweb.domain.Colegio;
import com.gapxgestioncolegiosweb.domain.Municipio;
import com.gapxgestioncolegiosweb.domain.Sede;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest")
public class SedeController {

    private SedeBusiness sedeB;

    @Autowired
    public void setCoService(SedeBusiness sedeBusiness) {
        this.sedeB = sedeBusiness;
    }

    @RequestMapping(value = "/sede", method=RequestMethod.GET)
    public @ResponseBody Iterable<Sede> listAll(
            @RequestParam(value = "colegioId", required = false) Long colegioId) 
    {
        if(colegioId != null){
            return this.sedeB.listAllSedesPorColegio(new Colegio(colegioId));
        }
        else{
            return this.sedeB.listAllSedes();
        }
    }
    
    @RequestMapping(value = "/sede/{id}", method = RequestMethod.GET)
    @Transactional
    public @ResponseBody Sede findById(
            @PathVariable("id") Long id) 
    {
        return this.sedeB.getSedeById(id);
    }
    
    @RequestMapping(value = "/sede/municipio/{id}", method = RequestMethod.GET)
    @Transactional
    public @ResponseBody Iterable<Sede> findByMunicipio(
            @PathVariable("id") Long municipio_id) 
    {
        return this.sedeB.listAllSedesPorMunicipio(new Municipio(municipio_id));
    }
    
    @RequestMapping(value = "/sede/colegio/{id}", method = RequestMethod.GET)
    @Transactional
    public @ResponseBody Iterable<Sede> findByColegio(
            @PathVariable("id") Long colegio_id) 
    {
        return this.sedeB.listAllSedesPorColegio(new Colegio(colegio_id));
    }
    
    @RequestMapping(value = "/sede", method = RequestMethod.POST)
    @Transactional
    public @ResponseBody Sede save(
            @RequestBody Sede sede) 
    {
        return this.sedeB.save(sede);
    }
    @RequestMapping(value = "/sede/{id}", method = RequestMethod.PUT)
    @Transactional
    public @ResponseBody Sede update(
            @RequestBody Sede sede, 
            @PathVariable("id") Long id) 
    {
        sede.setId(id);
        return this.sedeB.save(sede);
    }

}



