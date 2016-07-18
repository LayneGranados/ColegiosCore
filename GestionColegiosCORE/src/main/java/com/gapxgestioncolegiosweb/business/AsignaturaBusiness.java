package com.gapxgestioncolegiosweb.business;

import com.gapxgestioncolegiosweb.domain.AreaConocimiento;
import com.gapxgestioncolegiosweb.domain.Asignatura;

public interface AsignaturaBusiness {
    
    Iterable<Asignatura> listAllAsignaturas();
    
    Iterable<Asignatura> listAllAsignaturasByAreaConocimiento(AreaConocimiento areaConocimiento);

    Asignatura getAsignaturaById(Long id);

    Asignatura save(Asignatura asignatura);
}
