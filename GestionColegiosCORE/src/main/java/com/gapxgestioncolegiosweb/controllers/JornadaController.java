package com.gapxgestioncolegiosweb.controllers;

import com.gapxgestioncolegiosweb.business.JornadaBusiness;
import com.gapxgestioncolegiosweb.domain.Anio;
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
public class JornadaController {

    private JornadaBusiness jornadaB;

    @Autowired
    public void setJornadaService(JornadaBusiness jornadaB) {
        this.jornadaB = jornadaB;
    }
    
    @RequestMapping(value = "/jornada", method=RequestMethod.GET)
    public @ResponseBody Iterable<Jornada> listAll(
            @RequestParam(value = "anio", required = false) Long anio) 
    {
        if(anio != null) {
            return this.jornadaB.listAllJornadasByAnio(new Anio(anio));
        } else {
            return this.jornadaB.listAllJornadas();
        }
        
    }
    
    @RequestMapping(value = "/jornada/{id}", method = RequestMethod.GET)
    @Transactional
    public @ResponseBody Jornada findById(
            @PathVariable("id") Long id) 
    {
        return this.jornadaB.getJornadaById(id);
    }
    
    @RequestMapping(value = "/jornada", method = RequestMethod.POST)
    @Transactional
    public @ResponseBody Jornada save(
            @RequestBody Jornada jornada) 
    {
        return this.jornadaB.save(jornada);
    }
    
    @RequestMapping(value = "/jornada/{id}", method = RequestMethod.PUT)
    @Transactional
    public @ResponseBody Jornada update(
            @RequestBody Jornada jornada, 
            @PathVariable("id") Long id) 
    {
        jornada.setId(id);
        return this.jornadaB.save(jornada);
    }

}



