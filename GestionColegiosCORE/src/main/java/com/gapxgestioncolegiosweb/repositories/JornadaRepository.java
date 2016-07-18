package com.gapxgestioncolegiosweb.repositories;

import com.gapxgestioncolegiosweb.domain.Jornada;
import com.gapxgestioncolegiosweb.domain.Anio;
import com.gapxgestioncolegiosweb.domain.TipoJornada;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface JornadaRepository extends CrudRepository<Jornada, Long>{
    
    public List<Jornada> findByAnio(Anio anio);
    
    public List<Jornada> findByTipoJornada(TipoJornada tipoJornada);
    
}
