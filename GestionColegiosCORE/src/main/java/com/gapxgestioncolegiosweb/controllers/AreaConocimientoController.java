package com.gapxgestioncolegiosweb.controllers;

import com.gapxgestioncolegiosweb.business.AreaConocimientoBusiness;
import com.gapxgestioncolegiosweb.domain.AreaConocimiento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest")
public class AreaConocimientoController {

    private AreaConocimientoBusiness areaConocimientoB;

    @Autowired
    public void setAreaConocimientoBusiness(AreaConocimientoBusiness areaConocimientoBusiness) {
        this.areaConocimientoB = areaConocimientoBusiness;
    }
    
    @RequestMapping(value = "/area-conocimiento", method=RequestMethod.GET)
    public @ResponseBody Iterable<AreaConocimiento> listAll() 
    {
        return this.areaConocimientoB.listAllAreaConocimientos();
    }
    
    @RequestMapping(value = "/area-conocimiento/{id}", method = RequestMethod.GET)
    @Transactional
    public @ResponseBody AreaConocimiento findById(
            @PathVariable("id") Long id) 
    {
        return this.areaConocimientoB.getAreaConocimientoById(id);
    }
    
}



