/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gapxgestioncolegiosweb.business.impl;

import com.gapxgestioncolegiosweb.business.DepartamentoBusiness;
import com.gapxgestioncolegiosweb.domain.Departamento;
import com.gapxgestioncolegiosweb.repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author laygrana
 */
@Service
public class DepartamentoBusinessImpl implements DepartamentoBusiness{
    
    private DepartamentoRepository departamentoR;

    @Autowired
    public void setDepartamentoRepository(DepartamentoRepository departamentoRepository) {
        this.departamentoR = departamentoRepository;
    }

    @Override
    public Iterable<Departamento> listAllDepartamentos() {
        return this.departamentoR.findAll();
    }

    @Override
    public Departamento getDepartamentoById(Long id) {
        return this.departamentoR.findOne(id);
    }

    @Override
    public Departamento save(Departamento departamento) {
        return this.departamentoR.save(departamento);
    }
    
}
