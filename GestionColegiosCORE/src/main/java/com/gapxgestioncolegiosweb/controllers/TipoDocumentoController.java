package com.gapxgestioncolegiosweb.controllers;

import com.gapxgestioncolegiosweb.business.TipoDocumentoBusiness;
import com.gapxgestioncolegiosweb.domain.TipoDocumento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest")
public class TipoDocumentoController {

    private TipoDocumentoBusiness tipoDocumentoB;

    @Autowired
    public void setTipoDocumentoBusiness(TipoDocumentoBusiness tipoDocumentoBusiness) {
        this.tipoDocumentoB = tipoDocumentoBusiness;
    }
    
    @RequestMapping(value = "/tipo-documento", method=RequestMethod.GET)
    public @ResponseBody Iterable<TipoDocumento> listAll() 
    {
        return this.tipoDocumentoB.listAllTipoDocumentos();
    }
    
    @RequestMapping(value = "/tipo-documento/{id}", method = RequestMethod.GET)
    @Transactional
    public @ResponseBody TipoDocumento findById(
            @PathVariable("id") Long id) 
    {
        return this.tipoDocumentoB.getTipoDocumentoById(id);
    }
    
}



