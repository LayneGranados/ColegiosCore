/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gapxgestioncolegiosweb.business.impl;

import com.gapxgestioncolegiosweb.business.TipoJornadaBusiness;
import com.gapxgestioncolegiosweb.domain.TipoJornada;
import com.gapxgestioncolegiosweb.repositories.TipoJornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author laygrana
 */
@Service
public class TipoJornadaBusinessImpl implements TipoJornadaBusiness{
    
    private TipoJornadaRepository tipoJornadaR;

    @Autowired
    public void setColegioService(TipoJornadaRepository tipoJornadaService) {
        this.tipoJornadaR = tipoJornadaService;
    }

    @Override
    public Iterable<TipoJornada> listAllTipoJornadas() {
        return this.tipoJornadaR.findAll();
    }

    @Override
    public TipoJornada getTipoJornadaById(Long id) {
        return this.tipoJornadaR.findOne(id);
    }

    @Override
    public TipoJornada save(TipoJornada tipoJornada) {
        return this.tipoJornadaR.save(tipoJornada);
    }
    
}
