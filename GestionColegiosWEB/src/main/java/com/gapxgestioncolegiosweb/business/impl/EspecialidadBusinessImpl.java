/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gapxgestioncolegiosweb.business.impl;

import com.gapxgestioncolegiosweb.business.EspecialidadBusiness;
import com.gapxgestioncolegiosweb.domain.Especialidad;
import com.gapxgestioncolegiosweb.repositories.EspecialidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author laygrana
 */
@Service
public class EspecialidadBusinessImpl implements EspecialidadBusiness{
    
    private EspecialidadRepository especialidadR;

    @Autowired
    public void setColegioService(EspecialidadRepository especialidadService) {
        this.especialidadR = especialidadService;
    }

    @Override
    public Iterable<Especialidad> listAllEspecialidades() {
        return this.especialidadR.findAll();
    }

    @Override
    public Especialidad getEspecialidadById(Long id) {
        return this.especialidadR.findOne(id);
    }

    @Override
    public Especialidad save(Especialidad especialidad) {
        return this.especialidadR.save(especialidad);
    }
    
}
