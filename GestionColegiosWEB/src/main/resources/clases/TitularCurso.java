/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import com.gapxgestioncolegiosweb.domain.Curso;
import java.io.Serializable;
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
@Table(name = "titular_curso")
public class TitularCurso implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "titular_curso_id")
    private Integer titularCursoId;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    
    @JoinColumn(name = "curso_id", referencedColumnName = "curso_id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Curso cursoId;
    
    @JoinColumn(name = "profesor_id", referencedColumnName = "profesor_id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Profesor profesorId;

    public TitularCurso() {
    }

    public TitularCurso(Integer titularCursoId) {
        this.titularCursoId = titularCursoId;
    }

    public TitularCurso(Integer titularCursoId, Date fechaInicio) {
        this.titularCursoId = titularCursoId;
        this.fechaInicio = fechaInicio;
    }

    public Integer getTitularCursoId() {
        return titularCursoId;
    }

    public void setTitularCursoId(Integer titularCursoId) {
        this.titularCursoId = titularCursoId;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Curso getCursoId() {
        return cursoId;
    }

    public void setCursoId(Curso cursoId) {
        this.cursoId = cursoId;
    }

    public Profesor getProfesorId() {
        return profesorId;
    }

    public void setProfesorId(Profesor profesorId) {
        this.profesorId = profesorId;
    }

}
