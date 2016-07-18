package com.gapxgestioncolegiosweb.repositories;

import com.gapxgestioncolegiosweb.domain.Colegio;
import com.gapxgestioncolegiosweb.domain.Municipio;
import com.gapxgestioncolegiosweb.domain.Sede;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface SedeRepository extends CrudRepository<Sede, Long>{
    
    public List<Sede> findByMunicipio(Municipio municipio);
    
    public List<Sede> findByColegio(Colegio colegio);
}
