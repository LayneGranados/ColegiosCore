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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author laygrana
 */
@Entity
public class Anio implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "anio_id")
    private Long id;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "anio")
    private String anio;
    
    @Column(name = "actual")
    private Boolean actual;
    
    @Lob
    @Size(max = 65535)
    @Column(name = "descripcion")
    private String descripcion;
    
    @JoinColumn(name = "sede_id", referencedColumnName = "sede_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Sede sede;

    public Anio() {
    }

    public Anio(Long id) {
        this.id = id;
    }

    public Anio(Long id, String anio) {
        this.id = id;
        this.anio = anio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public Boolean getActual() {
        return actual;
    }

    public void setActual(Boolean actual) {
        this.actual = actual;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sedeId) {
        this.sede = sedeId;
    }
    
}
