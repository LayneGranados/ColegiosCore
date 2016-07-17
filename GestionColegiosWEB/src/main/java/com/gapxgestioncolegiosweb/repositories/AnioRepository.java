package com.gapxgestioncolegiosweb.repositories;

import com.gapxgestioncolegiosweb.domain.Anio;
import com.gapxgestioncolegiosweb.domain.Sede;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface AnioRepository extends CrudRepository<Anio, Long>{
    
    public List<Anio> findBySede(Sede sede);
    
}
