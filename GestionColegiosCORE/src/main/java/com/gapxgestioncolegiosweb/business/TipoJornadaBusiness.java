package com.gapxgestioncolegiosweb.business;


import com.gapxgestioncolegiosweb.domain.TipoJornada;

public interface TipoJornadaBusiness {
    
    Iterable<TipoJornada> listAllTipoJornadas();

    TipoJornada getTipoJornadaById(Long id);

    TipoJornada save(TipoJornada tipoJornada);
}
