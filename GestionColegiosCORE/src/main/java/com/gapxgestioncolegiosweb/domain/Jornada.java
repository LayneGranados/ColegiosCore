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
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author laygrana
 */
@Entity
public class Jornada implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "jornada_id")
    private Long id;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    
    @JoinColumn(name = "anio_id", referencedColumnName = "anio_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Anio anio;
    
    @JoinColumn(name = "tipo_jornada_id", referencedColumnName = "tipo_jornada_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private TipoJornada tipoJornada;
    

    public Jornada() {
    }

    public Jornada(Long id) {
        this.id = id;
    }

    public Jornada(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Anio getAnio() {
        return anio;
    }

    public void setAnio(Anio anio) {
        this.anio = anio;
    }

    public TipoJornada getTipoJornada() {
        return tipoJornada;
    }

    public void setTipoJornada(TipoJornada tipoJornada) {
        this.tipoJornada = tipoJornada;
    }

    
}
