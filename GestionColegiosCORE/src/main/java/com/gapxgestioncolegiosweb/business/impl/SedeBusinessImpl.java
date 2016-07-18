/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gapxgestioncolegiosweb.business.impl;

import com.gapxgestioncolegiosweb.business.ColegioBusiness;
import com.gapxgestioncolegiosweb.business.SedeBusiness;
import com.gapxgestioncolegiosweb.domain.Municipio;
import com.gapxgestioncolegiosweb.domain.Colegio;
import com.gapxgestioncolegiosweb.domain.Sede;
import com.gapxgestioncolegiosweb.repositories.ColegioRepository;
import com.gapxgestioncolegiosweb.repositories.SedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author laygrana
 */
@Service
public class SedeBusinessImpl implements SedeBusiness{
    
    private SedeRepository sedeR;

    @Autowired
    public void setColegioService(SedeRepository sedeService) {
        this.sedeR = sedeService;
    }

    @Override
    public Iterable<Sede> listAllSedes() {
        return this.sedeR.findAll();
    }

    @Override
    public Sede getSedeById(Long id) {
        return this.sedeR.findOne(id);
    }

    @Override
    public Sede save(Sede sede) {
        return this.sedeR.save(sede);
    }

    @Override
    public Iterable<Sede> listAllSedesPorMunicipio(Municipio municipio) {
        return this.sedeR.findByMunicipio(municipio);
    }

    @Override
    public Iterable<Sede> listAllSedesPorColegio(Colegio colegio) {
        return this.sedeR.findByColegio(colegio);
    }
    
}
