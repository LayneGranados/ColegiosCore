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
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author laygrana
 */
@Entity
@Table(name = "sit_acad_anio_ant")
public class SitAcadAnioAnt implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sit_acad_anio_ant")
    private Integer sitAcadAnioAnt;
    
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "codigo")
    private Integer codigo;
  
    public SitAcadAnioAnt() {
    }

    public SitAcadAnioAnt(Integer sitAcadAnioAnt) {
        this.sitAcadAnioAnt = sitAcadAnioAnt;
    }

    public Integer getSitAcadAnioAnt() {
        return sitAcadAnioAnt;
    }

    public void setSitAcadAnioAnt(Integer sitAcadAnioAnt) {
        this.sitAcadAnioAnt = sitAcadAnioAnt;
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

}
