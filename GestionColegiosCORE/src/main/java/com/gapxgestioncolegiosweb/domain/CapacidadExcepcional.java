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
public class CapacidadExcepcional implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "capacidad_excepcional_id")
    private Integer capacidadExcepcionalId;
    
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "codigo")
    private Integer codigo;

    public CapacidadExcepcional() {
    }

    public CapacidadExcepcional(Integer capacidadExcepcionalId) {
        this.capacidadExcepcionalId = capacidadExcepcionalId;
    }

    public Integer getCapacidadExcepcionalId() {
        return capacidadExcepcionalId;
    }

    public void setCapacidadExcepcionalId(Integer capacidadExcepcionalId) {
        this.capacidadExcepcionalId = capacidadExcepcionalId;
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
