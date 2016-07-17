/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gapxgestioncolegiosweb.business.impl;

import com.gapxgestioncolegiosweb.business.AsignaturaBusiness;
import com.gapxgestioncolegiosweb.domain.AreaConocimiento;
import com.gapxgestioncolegiosweb.domain.Asignatura;
import com.gapxgestioncolegiosweb.repositories.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author laygrana
 */
@Service
public class AsignaturaBusinessImpl implements AsignaturaBusiness{
    
    private AsignaturaRepository asignaturaR;
    
    @Autowired
    public void setAsignaturaR(AsignaturaRepository asignaturaR) {
        this.asignaturaR = asignaturaR;
    }

    @Override
    public Iterable<Asignatura> listAllAsignaturas() {
        return this.asignaturaR.findAll();
    }

    @Override
    public Asignatura getAsignaturaById(Long id) {
        return this.asignaturaR.findOne(id);
    }
    
    @Override
    public Asignatura save(Asignatura asignatura) {
        return this.asignaturaR.save(asignatura);
    }

    @Override
    public Iterable<Asignatura> listAllAsignaturasByAreaConocimiento(AreaConocimiento areaConocimiento) {
        return this.asignaturaR.findByAreaConocimiento(areaConocimiento);
    }
    
}
