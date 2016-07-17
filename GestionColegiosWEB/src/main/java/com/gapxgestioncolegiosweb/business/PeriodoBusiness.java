package com.gapxgestioncolegiosweb.business;

import com.gapxgestioncolegiosweb.domain.Jornada;
import com.gapxgestioncolegiosweb.domain.Periodo;

public interface PeriodoBusiness {
    
    Iterable<Periodo> listAllPeriodo();
    
    Iterable<Periodo> listAllPeriodosPorJornada(Jornada jornada);

    Periodo getPeriodoById(Long id);

    Periodo save(Periodo periodo);
}
