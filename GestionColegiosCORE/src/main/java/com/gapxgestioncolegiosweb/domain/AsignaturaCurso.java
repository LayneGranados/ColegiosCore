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

/**
 *
 * @author laygrana
 */
@Entity
public class AsignaturaCurso implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "asignatura_curso_id")
    private Integer asignaturaCursoId;
    
    @Column(name = "cantidad_horas")
    private Integer cantidadHoras;
    
    @JoinColumn(name = "asignatura_id", referencedColumnName = "asignatura_id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Asignatura asignaturaId;
    
    @JoinColumn(name = "curso_id", referencedColumnName = "curso_id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Curso cursoId;
  
    public AsignaturaCurso() {
    }

    public AsignaturaCurso(Integer asignaturaCursoId) {
        this.asignaturaCursoId = asignaturaCursoId;
    }

    public Integer getAsignaturaCursoId() {
        return asignaturaCursoId;
    }

    public void setAsignaturaCursoId(Integer asignaturaCursoId) {
        this.asignaturaCursoId = asignaturaCursoId;
    }

    public Integer getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(Integer cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public Asignatura getAsignaturaId() {
        return asignaturaId;
    }

    public void setAsignaturaId(Asignatura asignaturaId) {
        this.asignaturaId = asignaturaId;
    }

    public Curso getCursoId() {
        return cursoId;
    }

    public void setCursoId(Curso cursoId) {
        this.cursoId = cursoId;
    }

}
