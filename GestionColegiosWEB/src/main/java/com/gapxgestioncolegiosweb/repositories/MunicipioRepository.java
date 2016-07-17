package com.gapxgestioncolegiosweb.repositories;

import com.gapxgestioncolegiosweb.domain.Departamento;
import com.gapxgestioncolegiosweb.domain.Municipio;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface MunicipioRepository extends CrudRepository<Municipio, Long>{
    
    public List<Municipio> findByDepartamento(Departamento departamento);
}
