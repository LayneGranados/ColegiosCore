/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gapxgestioncolegiosweb.business.impl;

import com.gapxgestioncolegiosweb.business.AreaConocimientoBusiness;
import com.gapxgestioncolegiosweb.domain.AreaConocimiento;
import com.gapxgestioncolegiosweb.repositories.AreaConocimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author laygrana
 */
@Service
public class AreaConocimientoBusinessImpl implements AreaConocimientoBusiness{
    
    private AreaConocimientoRepository areaConocimientoR;

    @Autowired
    public void setColegioService(AreaConocimientoRepository areaConocimientoService) {
        this.areaConocimientoR = areaConocimientoService;
    }

    @Override
    public Iterable<AreaConocimiento> listAllAreaConocimientos() {
        return this.areaConocimientoR.findAll();
    }

    @Override
    public AreaConocimiento getAreaConocimientoById(Long id) {
        return this.areaConocimientoR.findOne(id);
    }

    @Override
    public AreaConocimiento save(AreaConocimiento areaConocimiento) {
        return this.areaConocimientoR.save(areaConocimiento);
    }
    
}
