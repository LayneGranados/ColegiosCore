package com.gapxgestioncolegiosweb.business;


import com.gapxgestioncolegiosweb.domain.Especialidad;

public interface EspecialidadBusiness {
    
    Iterable<Especialidad> listAllEspecialidades();

    Especialidad getEspecialidadById(Long id);

    Especialidad save(Especialidad especialidad);
}
