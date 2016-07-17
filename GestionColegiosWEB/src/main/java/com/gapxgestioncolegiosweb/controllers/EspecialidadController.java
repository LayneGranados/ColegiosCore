package com.gapxgestioncolegiosweb.controllers;

import com.gapxgestioncolegiosweb.business.EspecialidadBusiness;
import com.gapxgestioncolegiosweb.domain.Especialidad;
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
public class EspecialidadController {

    private EspecialidadBusiness especialidadB;

    @Autowired
    public void setEspecialidadBusiness(EspecialidadBusiness especialidadBusiness) {
        this.especialidadB = especialidadBusiness;
    }
    
    @RequestMapping(value = "/especialidad", method=RequestMethod.GET)
    public @ResponseBody Iterable<Especialidad> listAll() 
    {
        return this.especialidadB.listAllEspecialidades();
    }
    
    @RequestMapping(value = "/especialidad/{id}", method = RequestMethod.GET)
    @Transactional
    public @ResponseBody Especialidad findById(
            @PathVariable("id") Long id) 
    {
        return this.especialidadB.getEspecialidadById(id);
    }
    
}



