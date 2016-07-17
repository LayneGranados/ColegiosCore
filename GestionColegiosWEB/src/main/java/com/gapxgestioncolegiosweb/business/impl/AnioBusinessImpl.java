/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gapxgestioncolegiosweb.business.impl;

import com.gapxgestioncolegiosweb.business.AnioBusiness;
import com.gapxgestioncolegiosweb.domain.Anio;
import com.gapxgestioncolegiosweb.domain.Sede;
import com.gapxgestioncolegiosweb.repositories.AnioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author laygrana
 */
@Service
public class AnioBusinessImpl implements AnioBusiness{
    
    private AnioRepository anioR;

    @Autowired
    public void setColegioService(AnioRepository anioService) {
        this.anioR = anioService;
    }

    @Override
    public Iterable<Anio> listAllAnios() {
        return this.anioR.findAll();
    }

    @Override
    public Anio getAnioById(Long id) {
        return this.anioR.findOne(id);
    }

    @Override
    public Anio save(Anio anio) {
        return this.anioR.save(anio);
    }

    @Override
    public Iterable<Anio> listAllAniosPorSede(Sede sede) {
        return this.anioR.findBySede(sede);
    }
    
}
