package com.gapxgestioncolegiosweb.controllers;

import com.gapxgestioncolegiosweb.business.MunicipioBusiness;
import com.gapxgestioncolegiosweb.domain.Departamento;
import com.gapxgestioncolegiosweb.domain.Municipio;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest")
public class MunicipioController {

    private MunicipioBusiness municipioB;

    @Autowired
    public void setMunicipioService(MunicipioBusiness municipioBusiness) {
        this.municipioB = municipioBusiness;
    }
    
    @RequestMapping(value = "/municipio", method=RequestMethod.GET)
    public @ResponseBody Iterable<Municipio> listAllFilter(
            @RequestParam(value = "departamentoId", required = false) Long idDepartamento) 
    {
        if(idDepartamento != null ) {
            return this.municipioB.listAllMunicipiosPorDepartamento(new Departamento(idDepartamento));
        }else {
            return new ArrayList<Municipio>();
        }
    }
    
    @RequestMapping(value = "/municipio/{id}", method = RequestMethod.GET)
    @Transactional
    public @ResponseBody Municipio findById(
            @PathVariable("id") Long id) 
    {
        return this.municipioB.getMunicipioById(id);
    }

}



