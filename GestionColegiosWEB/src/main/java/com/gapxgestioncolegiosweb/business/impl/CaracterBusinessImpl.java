/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gapxgestioncolegiosweb.business.impl;

import com.gapxgestioncolegiosweb.business.CaracterBusiness;
import com.gapxgestioncolegiosweb.domain.Caracter;
import com.gapxgestioncolegiosweb.repositories.CaracterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author laygrana
 */
@Service
public class CaracterBusinessImpl implements CaracterBusiness{
    
    private CaracterRepository caracterR;

    @Autowired
    public void setColegioService(CaracterRepository caracterService) {
        this.caracterR = caracterService;
    }

    @Override
    public Iterable<Caracter> listAllCaracters() {
        return this.caracterR.findAll();
    }

    @Override
    public Caracter getCaracterById(Long id) {
        return this.caracterR.findOne(id);
    }

    @Override
    public Caracter save(Caracter caracter) {
        return this.caracterR.save(caracter);
    }
    
}
