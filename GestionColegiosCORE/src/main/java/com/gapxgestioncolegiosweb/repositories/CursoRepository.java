package com.gapxgestioncolegiosweb.repositories;

import com.gapxgestioncolegiosweb.domain.Curso;
import com.gapxgestioncolegiosweb.domain.Grado;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, Long>{
    
    public List<Curso> findByGrado(Grado grado);
    
}
