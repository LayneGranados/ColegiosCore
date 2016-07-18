/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gapxgestioncolegiosweb.business.impl;

import com.gapxgestioncolegiosweb.business.ColegioBusiness;
import com.gapxgestioncolegiosweb.domain.Municipio;
import com.gapxgestioncolegiosweb.domain.Colegio;
import com.gapxgestioncolegiosweb.repositories.ColegioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author laygrana
 */
@Service
public class ColegioBusinessImpl implements ColegioBusiness{
    
    private ColegioRepository colegioR;

    @Autowired
    public void setColegioService(ColegioRepository colegioService) {
        this.colegioR = colegioService;
    }

    @Override
    public Iterable<Colegio> listAllColegios() {
        return this.colegioR.findAll();
    }

    @Override
    public Colegio getColegioById(Long id) {
        return this.colegioR.findOne(id);
    }

    @Override
    public Colegio save(Colegio colegio) {
        return this.colegioR.save(colegio);
    }

    @Override
    public Iterable<Colegio> listAllColegiosPorMunicipio(Municipio municipio) {
        return this.colegioR.findByMunicipio(municipio);
    }
    
}
