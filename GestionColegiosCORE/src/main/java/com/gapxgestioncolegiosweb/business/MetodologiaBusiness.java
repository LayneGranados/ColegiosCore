package com.gapxgestioncolegiosweb.business;


import com.gapxgestioncolegiosweb.domain.Metodologia;

public interface MetodologiaBusiness {
    
    Iterable<Metodologia> listAllMetodologias();

    Metodologia getMetodologiaById(Long id);

    Metodologia save(Metodologia metodologia);
}
