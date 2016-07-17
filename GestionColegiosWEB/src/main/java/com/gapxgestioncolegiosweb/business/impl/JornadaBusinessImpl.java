/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gapxgestioncolegiosweb.business.impl;

import com.gapxgestioncolegiosweb.business.JornadaBusiness;
import com.gapxgestioncolegiosweb.domain.Anio;
import com.gapxgestioncolegiosweb.domain.Jornada;
import com.gapxgestioncolegiosweb.domain.TipoJornada;
import com.gapxgestioncolegiosweb.repositories.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author laygrana
 */
@Service
public class JornadaBusinessImpl implements JornadaBusiness{
    
    private JornadaRepository jornadaR;
    
    @Autowired
    public void setJornadaR(JornadaRepository jornadaR) {
        this.jornadaR = jornadaR;
    }

    @Override
    public Iterable<Jornada> listAllJornadas() {
        return this.jornadaR.findAll();
    }

    @Override
    public Jornada getJornadaById(Long id) {
        return this.jornadaR.findOne(id);
    }

    @Override
    public Iterable<Jornada> getAllJornadasByTipoJornada(TipoJornada tipoJornada) {
        return this.jornadaR.findByTipoJornada(tipoJornada);
    }

    @Override
    public Jornada save(Jornada jornada) {
        return this.jornadaR.save(jornada);
    }

    @Override
    public Iterable<Jornada> listAllJornadasByAnio(Anio anio) {
        return this.jornadaR.findByAnio(anio);
    }
    
}
