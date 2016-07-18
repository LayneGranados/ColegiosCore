package com.gapxgestioncolegiosweb.repositories;

import com.gapxgestioncolegiosweb.domain.Grado;
import com.gapxgestioncolegiosweb.domain.Jornada;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface GradoRepository extends CrudRepository<Grado, Long>{
    
    public List<Grado> findByJornada(Jornada jornada);
    
}
