package com.gapxgestioncolegiosweb.controllers;

import com.gapxgestioncolegiosweb.business.CaracterBusiness;
import com.gapxgestioncolegiosweb.domain.Caracter;
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
public class CaracterController {

    private CaracterBusiness caracterB;

    @Autowired
    public void setCaracterBusiness(CaracterBusiness caracterBusiness) {
        this.caracterB = caracterBusiness;
    }
    
    @RequestMapping(value = "/caracter", method=RequestMethod.GET)
    public @ResponseBody Iterable<Caracter> listAll() 
    {
        return this.caracterB.listAllCaracters();
    }
    
    @RequestMapping(value = "/caracter/{id}", method = RequestMethod.GET)
    @Transactional
    public @ResponseBody Caracter findById(
            @PathVariable("id") Long id) 
    {
        return this.caracterB.getCaracterById(id);
    }
    
}



