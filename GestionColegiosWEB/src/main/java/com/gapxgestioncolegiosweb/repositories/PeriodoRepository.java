package com.gapxgestioncolegiosweb.repositories;

import com.gapxgestioncolegiosweb.domain.Jornada;
import com.gapxgestioncolegiosweb.domain.Periodo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface PeriodoRepository extends CrudRepository<Periodo, Long>{
    
    public List<Periodo> findByJornada(Jornada jornada);
    
}
