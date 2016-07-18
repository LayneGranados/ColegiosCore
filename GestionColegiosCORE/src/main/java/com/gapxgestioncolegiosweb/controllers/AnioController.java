package com.gapxgestioncolegiosweb.controllers;

import com.gapxgestioncolegiosweb.business.AnioBusiness;
import com.gapxgestioncolegiosweb.domain.Anio;
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
public class AnioController {

    private AnioBusiness anioB;

    @Autowired
    public void setAnioBusiness(AnioBusiness anioBusiness) {
        this.anioB = anioBusiness;
    }

    @RequestMapping(value = "/anio", method=RequestMethod.GET)
    public @ResponseBody Iterable<Anio> listAll(
            @RequestParam(value = "sede", required = false) Long sede) 
    {
        if(sede != null) {
            return this.anioB.listAllAniosPorSede(new Sede(sede));
        } else {
            return this.anioB.listAllAnios();
        }
        
    }
    
    @RequestMapping(value = "/anio/{id}", method = RequestMethod.GET)
    @Transactional
    public @ResponseBody Anio findById(
            @PathVariable("id") Long id) 
    {
        return this.anioB.getAnioById(id);
    }
    
    @RequestMapping(value = "/anio/sede/{id}", method = RequestMethod.GET)
    @Transactional
    public @ResponseBody Iterable<Anio> findBySede(
            @PathVariable("id") Long sede_id) 
    {
        return this.anioB.listAllAniosPorSede(new Sede(sede_id));
    }
    
    @RequestMapping(value = "/anio", method = RequestMethod.POST)
    @Transactional
    public @ResponseBody Anio save(
            @RequestBody Anio anio) 
    {
        return this.anioB.save(anio);
    }
    
    @RequestMapping(value = "/anio/{id}", method = RequestMethod.PUT)
    @Transactional
    public @ResponseBody Anio update(
            @RequestBody Anio anio, 
            @PathVariable("id") Long id) 
    {
        anio.setId(id);
        return this.anioB.save(anio);
    }

}



