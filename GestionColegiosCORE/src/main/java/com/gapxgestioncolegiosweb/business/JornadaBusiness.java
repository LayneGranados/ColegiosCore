package com.gapxgestioncolegiosweb.business;


import com.gapxgestioncolegiosweb.domain.Anio;
import com.gapxgestioncolegiosweb.domain.Jornada;
import com.gapxgestioncolegiosweb.domain.TipoJornada;

public interface JornadaBusiness {
    
    Iterable<Jornada> listAllJornadas();
    
    Iterable<Jornada> listAllJornadasByAnio(Anio anio);

    Jornada getJornadaById(Long id);
    
    Iterable<Jornada> getAllJornadasByTipoJornada(TipoJornada tipoJornada);

    Jornada save(Jornada jornada);
}
