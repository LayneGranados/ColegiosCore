package com.gapxgestioncolegiosweb.controllers;

import com.gapxgestioncolegiosweb.business.GradoBusiness;
import com.gapxgestioncolegiosweb.domain.Grado;
import com.gapxgestioncolegiosweb.domain.Jornada;
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
public class GradoController {

    private GradoBusiness gradoB;

    @Autowired
    public void setGradoService(GradoBusiness gradoB) {
        this.gradoB = gradoB;
    }
    
    @RequestMapping(value = "/grado", method=RequestMethod.GET)
    public @ResponseBody Iterable<Grado> listAll(
            @RequestParam(value = "jornada", required = false) Long jornada) 
    {
        if( jornada != null ) {
            return this.gradoB.getAllGradosByJornada(new Jornada(jornada));
        }
        else {
            return this.gradoB.listAllGrados();
        }
        
    }
    
    @RequestMapping(value = "/grado/{id}", method = RequestMethod.GET)
    @Transactional
    public @ResponseBody Grado findById(
            @PathVariable("id") Long id) 
    {
        return this.gradoB.getGradoById(id);
    }
    
    @RequestMapping(value = "/grado", method = RequestMethod.POST)
    @Transactional
    public @ResponseBody Grado save(
            @RequestBody Grado grado) 
    {
        return this.gradoB.save(grado);
    }
    
    @RequestMapping(value = "/grado/{id}", method = RequestMethod.PUT)
    @Transactional
    public @ResponseBody Grado update(
            @RequestBody Grado grado, 
            @PathVariable("id") Long id) 
    {
        grado.setId(id);
        return this.gradoB.save(grado);
    }

}



