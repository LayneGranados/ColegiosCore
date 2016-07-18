/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gapxgestioncolegiosweb.business.impl;

import com.gapxgestioncolegiosweb.business.GradoBusiness;
import com.gapxgestioncolegiosweb.domain.Grado;
import com.gapxgestioncolegiosweb.domain.Jornada;
import com.gapxgestioncolegiosweb.repositories.GradoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author laygrana
 */
@Service
public class GradoBusinessImpl implements GradoBusiness{
    
    private GradoRepository gradoR;
    
    @Autowired
    public void setGradoR(GradoRepository gradoR) {
        this.gradoR = gradoR;
    }

    @Override
    public Iterable<Grado> listAllGrados() {
        return this.gradoR.findAll();
    }

    @Override
    public Grado getGradoById(Long id) {
        return this.gradoR.findOne(id);
    }

    @Override
    public Iterable<Grado> getAllGradosByJornada(Jornada jornada) {
        return this.gradoR.findByJornada(jornada);
    }

    @Override
    public Grado save(Grado grado) {
        return this.gradoR.save(grado);
    }
    
}
