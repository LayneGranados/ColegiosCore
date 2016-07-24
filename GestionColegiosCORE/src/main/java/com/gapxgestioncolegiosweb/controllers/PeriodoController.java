package com.gapxgestioncolegiosweb.controllers;

import com.gapxgestioncolegiosweb.business.PeriodoBusiness;
import com.gapxgestioncolegiosweb.domain.Jornada;
import com.gapxgestioncolegiosweb.domain.Periodo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
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
public class PeriodoController {

    private PeriodoBusiness periodoB;

    @Autowired
    public void setPeriodoBusiness(PeriodoBusiness periodoB) {
        this.periodoB = periodoB;
    }
    
    @RequestMapping(value = "/periodo", method=RequestMethod.GET)
    public @ResponseBody Iterable<Periodo> listAll(
            @RequestParam(value = "jornada", required = false) Long jornada) 
    {
        if( jornada != null ) {
            return this.periodoB.listAllPeriodosPorJornada(new Jornada(jornada));
        }
        else {
            return this.periodoB.listAllPeriodo();
        }
    }
    
    @RequestMapping(value = "/periodo/{id}", method = RequestMethod.GET)
    @Transactional
    public @ResponseBody Periodo findById(
            @PathVariable("id") Long id) 
    {
        return this.periodoB.getPeriodoById(id);
    }
    
    @RequestMapping(value = "/periodo", method = RequestMethod.POST)
    @Transactional
    public @ResponseBody Periodo save(
            @RequestBody Periodo periodo) 
    {
        return this.periodoB.save(periodo);
    }
    
    @RequestMapping(value = "/periodo/{id}", method = RequestMethod.PUT)
    @Transactional
    public @ResponseBody Periodo update(
            @RequestBody Periodo periodo, 
            @PathVariable("id") Long id) 
    {   
        periodo.setId(id); 
        return this.periodoB.save(periodo);
    }

}



