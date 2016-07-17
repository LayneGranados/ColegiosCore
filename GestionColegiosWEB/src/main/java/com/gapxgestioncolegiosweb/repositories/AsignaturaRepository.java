package com.gapxgestioncolegiosweb.repositories;

import com.gapxgestioncolegiosweb.domain.Asignatura;
import com.gapxgestioncolegiosweb.domain.AreaConocimiento;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface AsignaturaRepository extends CrudRepository<Asignatura, Long>{
    
    public List<Asignatura> findByAreaConocimiento(AreaConocimiento areaConocimiento);
     
}
