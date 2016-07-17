package com.gapxgestioncolegiosweb.business;


import com.gapxgestioncolegiosweb.domain.Caracter;

public interface CaracterBusiness {
    
    Iterable<Caracter> listAllCaracters();

    Caracter getCaracterById(Long id);

    Caracter save(Caracter caracter);
}
