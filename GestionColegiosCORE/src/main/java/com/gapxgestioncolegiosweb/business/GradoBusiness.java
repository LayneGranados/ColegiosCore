package com.gapxgestioncolegiosweb.business;


import com.gapxgestioncolegiosweb.domain.Grado;
import com.gapxgestioncolegiosweb.domain.Jornada;

public interface GradoBusiness {
    
    Iterable<Grado> listAllGrados();

    Grado getGradoById(Long id);
    
    Iterable<Grado> getAllGradosByJornada(Jornada jornada);

    Grado save(Grado grado);
}
