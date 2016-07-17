/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gapxgestioncolegiosweb.domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author laygrana
 */
@Entity
@Table(name = "asignatura_curso_profesor")
public class AsignaturaCursoProfesor implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "asignatura_curso_profesor_id")
    private Integer asignaturaCursoProfesorId;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "profesor_id")
    private int profesorId;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    
    @Column(name = "fecha_fin")
    private BigInteger fechaFin;
    
    @JoinColumn(name = "asignatura_curso_id", referencedColumnName = "asignatura_curso_id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private AsignaturaCurso asignaturaCursoId;

    public AsignaturaCursoProfesor() {
    }

    public AsignaturaCursoProfesor(Integer asignaturaCursoProfesorId) {
        this.asignaturaCursoProfesorId = asignaturaCursoProfesorId;
    }

    public AsignaturaCursoProfesor(Integer asignaturaCursoProfesorId, int profesorId, Date fechaInicio) {
        this.asignaturaCursoProfesorId = asignaturaCursoProfesorId;
        this.profesorId = profesorId;
        this.fechaInicio = fechaInicio;
    }

    public Integer getAsignaturaCursoProfesorId() {
        return asignaturaCursoProfesorId;
    }

    public void setAsignaturaCursoProfesorId(Integer asignaturaCursoProfesorId) {
        this.asignaturaCursoProfesorId = asignaturaCursoProfesorId;
    }

    public int getProfesorId() {
        return profesorId;
    }

    public void setProfesorId(int profesorId) {
        this.profesorId = profesorId;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public BigInteger getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(BigInteger fechaFin) {
        this.fechaFin = fechaFin;
    }

    public AsignaturaCurso getAsignaturaCursoId() {
        return asignaturaCursoId;
    }

    public void setAsignaturaCursoId(AsignaturaCurso asignaturaCursoId) {
        this.asignaturaCursoId = asignaturaCursoId;
    }
    
}
