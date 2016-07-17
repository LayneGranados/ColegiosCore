package com.gapxgestioncolegiosweb.business;


import com.gapxgestioncolegiosweb.domain.Departamento;

public interface DepartamentoBusiness {
    Iterable<Departamento> listAllDepartamentos();

    Departamento getDepartamentoById(Long id);

    Departamento save(Departamento departamento);
}
