/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gapxgestioncolegiosweb.business.impl;

import com.gapxgestioncolegiosweb.business.CursoBusiness;
import com.gapxgestioncolegiosweb.domain.Curso;
import com.gapxgestioncolegiosweb.domain.Grado;
import com.gapxgestioncolegiosweb.domain.Jornada;
import com.gapxgestioncolegiosweb.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author laygrana
 */
@Service
public class CursoBusinessImpl implements CursoBusiness{
    
    private CursoRepository gradoR;
    
    @Autowired
    public void setCursoR(CursoRepository gradoR) {
        this.gradoR = gradoR;
    }

    @Override
    public Iterable<Curso> listAllCursos() {
        return this.gradoR.findAll();
    }

    @Override
    public Curso getCursoById(Long id) {
        return this.gradoR.findOne(id);
    }

    @Override
    public Iterable<Curso> getAllCursosByGrado(Grado grado) {
        return this.gradoR.findByGrado(grado);
    }

    @Override
    public Curso save(Curso grado) {
        return this.gradoR.save(grado);
    }
    
}
