package com.gapxgestioncolegiosweb.business;


import com.gapxgestioncolegiosweb.domain.TipoDocumento;

public interface TipoDocumentoBusiness {
    
    Iterable<TipoDocumento> listAllTipoDocumentos();

    TipoDocumento getTipoDocumentoById(Long id);

    TipoDocumento save(TipoDocumento tipoDocumento);
}
