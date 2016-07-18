package com.gapxgestioncolegiosweb.business;


import com.gapxgestioncolegiosweb.domain.Anio;
import com.gapxgestioncolegiosweb.domain.Sede;

public interface AnioBusiness {
    int type=1;
    Iterable<Anio> listAllAnios();
    
    Iterable<Anio> listAllAniosPorSede(Sede sede);

    Anio getAnioById(Long id);

    Anio save(Anio anio);
}
