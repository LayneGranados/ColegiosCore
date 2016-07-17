/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gapxgestioncolegiosweb.business.impl;

import com.gapxgestioncolegiosweb.business.MetodologiaBusiness;
import com.gapxgestioncolegiosweb.domain.Metodologia;
import com.gapxgestioncolegiosweb.repositories.MetodologiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author laygrana
 */
@Service
public class MetodologiaBusinessImpl implements MetodologiaBusiness{
    
    private MetodologiaRepository metodologiaR;

    @Autowired
    public void setColegioService(MetodologiaRepository metodologiaService) {
        this.metodologiaR = metodologiaService;
    }

    @Override
    public Iterable<Metodologia> listAllMetodologias() {
        return this.metodologiaR.findAll();
    }

    @Override
    public Metodologia getMetodologiaById(Long id) {
        return this.metodologiaR.findOne(id);
    }

    @Override
    public Metodologia save(Metodologia metodologia) {
        return this.metodologiaR.save(metodologia);
    }
    
}
