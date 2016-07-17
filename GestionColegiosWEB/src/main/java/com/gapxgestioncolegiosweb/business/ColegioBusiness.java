package com.gapxgestioncolegiosweb.business;


import com.gapxgestioncolegiosweb.domain.Municipio;
import com.gapxgestioncolegiosweb.domain.Colegio;

public interface ColegioBusiness {
    
    Iterable<Colegio> listAllColegios();
    
    Iterable<Colegio> listAllColegiosPorMunicipio(Municipio municipio);

    Colegio getColegioById(Long id);

    Colegio save(Colegio colegio);
}
