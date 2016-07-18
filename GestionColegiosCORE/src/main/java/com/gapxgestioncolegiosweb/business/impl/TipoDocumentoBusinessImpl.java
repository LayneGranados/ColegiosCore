/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gapxgestioncolegiosweb.business.impl;

import com.gapxgestioncolegiosweb.business.TipoDocumentoBusiness;
import com.gapxgestioncolegiosweb.domain.TipoDocumento;
import com.gapxgestioncolegiosweb.repositories.TipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author laygrana
 */
@Service
public class TipoDocumentoBusinessImpl implements TipoDocumentoBusiness{
    
    private TipoDocumentoRepository tipoDocumentoR;

    @Autowired
    public void setColegioService(TipoDocumentoRepository tipoDocumentoService) {
        this.tipoDocumentoR = tipoDocumentoService;
    }

    @Override
    public Iterable<TipoDocumento> listAllTipoDocumentos() {
        return this.tipoDocumentoR.findAll();
    }

    @Override
    public TipoDocumento getTipoDocumentoById(Long id) {
        return this.tipoDocumentoR.findOne(id);
    }

    @Override
    public TipoDocumento save(TipoDocumento tipoDocumento) {
        return this.tipoDocumentoR.save(tipoDocumento);
    }
    
}
