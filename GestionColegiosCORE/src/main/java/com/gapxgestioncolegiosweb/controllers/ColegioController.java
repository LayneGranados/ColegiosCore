package com.gapxgestioncolegiosweb.controllers;

import com.gapxgestioncolegiosweb.business.ColegioBusiness;
import com.gapxgestioncolegiosweb.domain.Colegio;
import com.gapxgestioncolegiosweb.domain.Municipio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest")
public class ColegioController {

    private ColegioBusiness colegioB;

    @Autowired
    public void setColegioService(ColegioBusiness colegioBusiness) {
        this.colegioB = colegioBusiness;
    }

    @RequestMapping(value = "/colegio", method=RequestMethod.GET)
    public @ResponseBody Iterable<Colegio> listAll() 
    {
        return this.colegioB.listAllColegios();
    }
    
    @RequestMapping(value = "/colegio/{id}", method = RequestMethod.GET)
    @Transactional
    public @ResponseBody Colegio findById(
            @PathVariable("id") Long id) 
    {
        return this.colegioB.getColegioById(id);   
    }
    
    @RequestMapping(value = "/colegio/municipio/{id}", method = RequestMethod.GET)
    @Transactional
    public @ResponseBody Iterable<Colegio> findByMunicipio(
            @PathVariable("id") Long municipio_id) 
    {
        return this.colegioB.listAllColegiosPorMunicipio(new Municipio(municipio_id));
    }
    
    @RequestMapping(value = "/colegio", method = RequestMethod.POST)
    @Transactional
    public @ResponseBody Colegio save(
            @RequestBody Colegio colegio) 
    {
        return this.colegioB.save(colegio);
    }
    
    @RequestMapping(value = "/colegio/{id}", method = RequestMethod.PUT)
    @Transactional
    public @ResponseBody Colegio update(
            @RequestBody Colegio colegio, 
            @PathVariable("id") Long id) 
    {
        colegio.setId(id);
        return this.colegioB.save(colegio);
    }

}



