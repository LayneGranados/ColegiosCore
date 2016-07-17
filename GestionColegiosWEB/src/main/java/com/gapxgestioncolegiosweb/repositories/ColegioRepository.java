package com.gapxgestioncolegiosweb.repositories;

import com.gapxgestioncolegiosweb.domain.Municipio;
import com.gapxgestioncolegiosweb.domain.Colegio;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ColegioRepository extends CrudRepository<Colegio, Long>{
    
    public List<Colegio> findByMunicipio(Municipio municipio);
}
