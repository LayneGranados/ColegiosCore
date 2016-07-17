package com.gapxgestioncolegiosweb.controllers;

import com.gapxgestioncolegiosweb.business.TipoJornadaBusiness;
import com.gapxgestioncolegiosweb.domain.TipoJornada;
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
public class TipoJornadaController {

    private TipoJornadaBusiness tipoJornadaB;

    @Autowired
    public void setTipoJornadaBusiness(TipoJornadaBusiness tipoJornadaBusiness) {
        this.tipoJornadaB = tipoJornadaBusiness;
    }
    
    @RequestMapping(value = "/tipo-jornada", method=RequestMethod.GET)
    public @ResponseBody Iterable<TipoJornada> listAll() 
    {
        return this.tipoJornadaB.listAllTipoJornadas();
    }
    
    @RequestMapping(value = "/tipo-jornada/{id}", method = RequestMethod.GET)
    @Transactional
    public @ResponseBody TipoJornada findById(
            @PathVariable("id") Long id) 
    {
        return this.tipoJornadaB.getTipoJornadaById(id);
    }
    
}



