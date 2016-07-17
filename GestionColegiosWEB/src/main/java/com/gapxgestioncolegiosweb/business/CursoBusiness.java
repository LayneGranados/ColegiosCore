package com.gapxgestioncolegiosweb.business;


import com.gapxgestioncolegiosweb.domain.Curso;
import com.gapxgestioncolegiosweb.domain.Grado;

public interface CursoBusiness {
    
    Iterable<Curso> listAllCursos();

    Curso getCursoById(Long id);
    
    Iterable<Curso> getAllCursosByGrado(Grado grado);

    Curso save(Curso curso);
}
