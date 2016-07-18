package com.gapxgestioncolegiosweb.business;


import com.gapxgestioncolegiosweb.domain.AreaConocimiento;

public interface AreaConocimientoBusiness {
    
    Iterable<AreaConocimiento> listAllAreaConocimientos();

    AreaConocimiento getAreaConocimientoById(Long id);

    AreaConocimiento save(AreaConocimiento areaConocimiento);
}
