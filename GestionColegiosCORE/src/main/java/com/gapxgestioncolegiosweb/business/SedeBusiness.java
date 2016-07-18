package com.gapxgestioncolegiosweb.business;


import com.gapxgestioncolegiosweb.domain.Colegio;
import com.gapxgestioncolegiosweb.domain.Municipio;
import com.gapxgestioncolegiosweb.domain.Sede;

public interface SedeBusiness {
    
    Iterable<Sede> listAllSedes();
    
    Iterable<Sede> listAllSedesPorMunicipio(Municipio municipio);
    
    Iterable<Sede> listAllSedesPorColegio(Colegio colegio);

    Sede getSedeById(Long id);

    Sede save(Sede sede);
}
