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
public class Curso implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "curso_id")
    private Long id;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "nombre")
    private String nombre;
    
    @JoinColumn(name = "caracter_id", referencedColumnName = "caracter_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Caracter caracter;
    
    @JoinColumn(name = "grado_id", referencedColumnName = "grado_id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Grado grado;
    
    @JoinColumn(name = "especialidad_id", referencedColumnName = "especialidad_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Especialidad especialidad;
    
    @JoinColumn(name = "metodologia_id", referencedColumnName = "metodologia_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Metodologia metodologia;

    public Curso() {
    }

    public Curso(Long id) {
        this.id = id;
    }

    public Curso(Long id, String nombre) {
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

    public Caracter getCaracter() {
        return caracter;
    }

    public void setCaracter(Caracter caracter) {
        this.caracter = caracter;
    }

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Metodologia getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(Metodologia metodologia) {
        this.metodologia = metodologia;
    }
    
}
