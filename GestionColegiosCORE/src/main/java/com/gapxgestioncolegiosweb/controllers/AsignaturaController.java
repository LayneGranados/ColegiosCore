package com.gapxgestioncolegiosweb.controllers;

import com.gapxgestioncolegiosweb.business.AsignaturaBusiness;
import com.gapxgestioncolegiosweb.domain.Anio;
import com.gapxgestioncolegiosweb.domain.AreaConocimiento;
import com.gapxgestioncolegiosweb.domain.Asignatura;
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
public class AsignaturaController {

    private AsignaturaBusiness asignaturaB;

    @Autowired
    public void setAsignaturaService(AsignaturaBusiness asignaturaB) {
        this.asignaturaB = asignaturaB;
    }
    
    @RequestMapping(value = "/asignatura", method=RequestMethod.GET)
    public @ResponseBody Iterable<Asignatura> listAll(
            @RequestParam(value = "areaConocimiento", required = false) Long areaConocimiento) 
    {
        if(areaConocimiento != null) {
            return this.asignaturaB.listAllAsignaturasByAreaConocimiento(new AreaConocimiento(areaConocimiento));
        } else {
            return this.asignaturaB.listAllAsignaturas();
        }
    }
    
    @RequestMapping(value = "/asignatura/{id}", method = RequestMethod.GET)
    @Transactional
    public @ResponseBody Asignatura findById(
            @PathVariable("id") Long id) 
    {
        return this.asignaturaB.getAsignaturaById(id);
    }
    
    @RequestMapping(value = "/asignatura", method = RequestMethod.POST)
    @Transactional
    public @ResponseBody Asignatura save(
            @RequestBody Asignatura asignatura) 
    {
        return this.asignaturaB.save(asignatura);
    }
    
    @RequestMapping(value = "/asignatura/{id}", method = RequestMethod.PUT)
    @Transactional
    public @ResponseBody Asignatura update(
            @RequestBody Asignatura asignatura, 
            @PathVariable("id") Long id) 
    {
        asignatura.setId(id);
        return this.asignaturaB.save(asignatura);
    }

}



