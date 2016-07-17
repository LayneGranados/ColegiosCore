/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gapxgestioncolegiosweb.business.impl;

import com.gapxgestioncolegiosweb.business.MunicipioBusiness;
import com.gapxgestioncolegiosweb.domain.Departamento;
import com.gapxgestioncolegiosweb.domain.Municipio;
import com.gapxgestioncolegiosweb.repositories.MunicipioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author laygrana
 */
@Service
public class MunicipioBusinessImpl implements MunicipioBusiness{
    
    private MunicipioRepository municipioR;

    @Autowired
    public void setMunicipioService(MunicipioRepository municipioService) {
        this.municipioR = municipioService;
    }

    @Override
    public Iterable<Municipio> listAllMunicipios() {
        return this.municipioR.findAll();
    }

    @Override
    public Municipio getMunicipioById(Long id) {
        return this.municipioR.findOne(id);
    }

    @Override
    public Municipio save(Municipio municipio) {
        return this.municipioR.save(municipio);
    }

    @Override
    public Iterable<Municipio> listAllMunicipiosPorDepartamento(Departamento departamento) {
        return this.municipioR.findByDepartamento(departamento);
    }
    
}
