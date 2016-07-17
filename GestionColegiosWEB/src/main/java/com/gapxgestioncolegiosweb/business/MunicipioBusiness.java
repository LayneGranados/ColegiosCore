package com.gapxgestioncolegiosweb.business;


import com.gapxgestioncolegiosweb.domain.Departamento;
import com.gapxgestioncolegiosweb.domain.Municipio;

public interface MunicipioBusiness {
    
    Iterable<Municipio> listAllMunicipios();
    
    Iterable<Municipio> listAllMunicipiosPorDepartamento(Departamento departamento);

    Municipio getMunicipioById(Long id);

    Municipio save(Municipio municipio);
}
