/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gapxgestioncolegiosweb.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 *
 * @author laygrana
 */
@Entity
public class InstitucionFamiliar implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "institucion_familiar_id")
    private Integer institucionFamiliarId;
    
    @Size(max = 100)
    @Column(name = "nombre")
    private String nombre;
    
    public InstitucionFamiliar() {
    }

    public InstitucionFamiliar(Integer institucionFamiliarId) {
        this.institucionFamiliarId = institucionFamiliarId;
    }

    public Integer getInstitucionFamiliarId() {
        return institucionFamiliarId;
    }

    public void setInstitucionFamiliarId(Integer institucionFamiliarId) {
        this.institucionFamiliarId = institucionFamiliarId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
