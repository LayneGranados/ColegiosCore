package com.gapxgestioncolegiosweb.controllers;

import com.gapxgestioncolegiosweb.business.MetodologiaBusiness;
import com.gapxgestioncolegiosweb.domain.Metodologia;
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
public class MetodologiaController {

    private MetodologiaBusiness metodologiaB;

    @Autowired
    public void setMetodologiaBusiness(MetodologiaBusiness metodologiaBusiness) {
        this.metodologiaB = metodologiaBusiness;
    }
    
    @RequestMapping(value = "/metodologia", method=RequestMethod.GET)
    public @ResponseBody Iterable<Metodologia> listAll() 
    {
        return this.metodologiaB.listAllMetodologias();
    }
    
    @RequestMapping(value = "/metodologia/{id}", method = RequestMethod.GET)
    @Transactional
    public @ResponseBody Metodologia findById(
            @PathVariable("id") Long id) 
    {
        return this.metodologiaB.getMetodologiaById(id);
    }
    
}



