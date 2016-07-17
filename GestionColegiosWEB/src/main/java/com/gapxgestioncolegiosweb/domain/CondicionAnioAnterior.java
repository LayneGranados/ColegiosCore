/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gapxgestioncolegiosweb.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author laygrana
 */
@Entity
public class CondicionAnioAnterior implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "condicion_anio_anterior_id")
    private Integer condicionAnioAnteriorId;
    
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "codigo")
    private Integer codigo;
    
    @JoinColumn(name = "sit_acad_anio_ant", referencedColumnName = "sit_acad_anio_ant")
    @ManyToOne(fetch = FetchType.EAGER)
    private SitAcadAnioAnt sitAcadAnioAnt;

    public CondicionAnioAnterior() {
    }

    public CondicionAnioAnterior(Integer condicionAnioAnteriorId) {
        this.condicionAnioAnteriorId = condicionAnioAnteriorId;
    }

    public Integer getCondicionAnioAnteriorId() {
        return condicionAnioAnteriorId;
    }

    public void setCondicionAnioAnteriorId(Integer condicionAnioAnteriorId) {
        this.condicionAnioAnteriorId = condicionAnioAnteriorId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public SitAcadAnioAnt getSitAcadAnioAnt() {
        return sitAcadAnioAnt;
    }

    public void setSitAcadAnioAnt(SitAcadAnioAnt sitAcadAnioAnt) {
        this.sitAcadAnioAnt = sitAcadAnioAnt;
    }  
    
}
