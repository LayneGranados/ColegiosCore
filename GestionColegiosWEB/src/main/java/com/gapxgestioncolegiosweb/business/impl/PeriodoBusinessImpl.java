/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gapxgestioncolegiosweb.business.impl;

import com.gapxgestioncolegiosweb.business.JornadaBusiness;
import com.gapxgestioncolegiosweb.business.PeriodoBusiness;
import com.gapxgestioncolegiosweb.domain.Jornada;
import com.gapxgestioncolegiosweb.domain.Periodo;
import com.gapxgestioncolegiosweb.domain.TipoJornada;
import com.gapxgestioncolegiosweb.repositories.JornadaRepository;
import com.gapxgestioncolegiosweb.repositories.PeriodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author laygrana
 */
@Service
public class PeriodoBusinessImpl implements PeriodoBusiness{
    
    private PeriodoRepository periodoR;
    
    @Autowired
    public void setPeriodoR(PeriodoRepository periodoR) {
        this.periodoR = periodoR;
    }
    public PeriodoRepository getPeriodoR() {
        return periodoR;
    }

    @Override
    public Iterable<Periodo> listAllPeriodo() {
        return this.periodoR.findAll();
    }

    @Override
    public Iterable<Periodo> listAllPeriodosPorJornada(Jornada jornada) {
        return this.periodoR.findByJornada(jornada);
    }

    @Override
    public Periodo getPeriodoById(Long id) {
        return this.periodoR.findOne(id);
    }

    @Override
    public Periodo save(Periodo periodo) {
        return this.periodoR.save(periodo);
    }
    
}
