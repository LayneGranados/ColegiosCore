package com.gapxgestioncolegiosweb.controllers;

import com.gapxgestioncolegiosweb.business.DepartamentoBusiness;
import com.gapxgestioncolegiosweb.domain.Departamento;
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
public class DepartamentoController {

    private DepartamentoBusiness departamentoB;

    @Autowired
    public void setDepartamentoService(DepartamentoBusiness departamentoBusiness) {
        this.departamentoB = departamentoBusiness;
    }

    @RequestMapping(value = "/departamento", method=RequestMethod.GET)
    public @ResponseBody Iterable<Departamento> listAll() 
    {
        return this.departamentoB.listAllDepartamentos();
    }
    
    @RequestMapping(value = "/departamento/{id}", method = RequestMethod.GET)
    @Transactional
    public @ResponseBody Departamento findById(
            @PathVariable("id") Long id) 
    {
        return this.departamentoB.getDepartamentoById(id);
    }

}



