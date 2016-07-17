/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gapxgestioncolegiosweb.domain;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author laygrana
 */
@Entity
public class Sede implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sede_id")
    private Long id;
    
    @Size(max = 50)
    @Column(name = "antiguo_codigo_dane")
    private String antiguoCodigoDane;
    
    @Column(name = "consecutivo")
    private BigInteger consecutivo;
    
    @Column(name = "actual")
    private Boolean actual;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
    
    @JoinColumn(name = "colegio_id", referencedColumnName = "colegio_id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Colegio colegio;
    
    @JoinColumn(name = "municipio_id", referencedColumnName = "municipio_id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Municipio municipio;

    public Sede() {
    }

    public Sede(Long id) {
        this.id = id;
    }

    public String getAntiguoCodigoDane() {
        return antiguoCodigoDane;
    }

    public void setAntiguoCodigoDane(String antiguoCodigoDane) {
        this.antiguoCodigoDane = antiguoCodigoDane;
    }

    public BigInteger getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(BigInteger consecutivo) {
        this.consecutivo = consecutivo;
    }

    public Boolean getActual() {
        return actual;
    }

    public void setActual(Boolean actual) {
        this.actual = actual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Colegio getColegio() {
        return colegio;
    }

    public void setColegio(Colegio colegio) {
        this.colegio = colegio;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
    
    

    

   
}
