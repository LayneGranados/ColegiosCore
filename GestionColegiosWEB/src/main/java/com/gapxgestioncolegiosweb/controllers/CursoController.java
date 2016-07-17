package com.gapxgestioncolegiosweb.controllers;

import com.gapxgestioncolegiosweb.business.CursoBusiness;
import com.gapxgestioncolegiosweb.domain.Curso;
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
public class CursoController {

    private CursoBusiness cursoB;

    @Autowired
    public void setCursoService(CursoBusiness cursoB) {
        this.cursoB = cursoB;
    }
    
    @RequestMapping(value = "/curso", method=RequestMethod.GET)
    public @ResponseBody Iterable<Curso> listAll(
            @RequestParam(value = "grado", required = false) Long grado) 
    {
        if( grado != null ) {
            return this.cursoB.getAllCursosByGrado(new Grado(grado));
        }
        else {
            return this.cursoB.listAllCursos();
        }
        
    }
    
    @RequestMapping(value = "/curso/{id}", method = RequestMethod.GET)
    @Transactional
    public @ResponseBody Curso findById(
            @PathVariable("id") Long id) 
    {
        return this.cursoB.getCursoById(id);
    }
    
    @RequestMapping(value = "/curso", method = RequestMethod.POST)
    @Transactional
    public @ResponseBody Curso save(
            @RequestBody Curso curso) 
    {
        return this.cursoB.save(curso);
    }
    
    @RequestMapping(value = "/curso/{id}", method = RequestMethod.PUT)
    @Transactional
    public @ResponseBody Curso update(
            @RequestBody Curso curso, 
            @PathVariable("id") Long id) 
    {
        curso.setId(id);
        return this.cursoB.save(curso);
    }

}



