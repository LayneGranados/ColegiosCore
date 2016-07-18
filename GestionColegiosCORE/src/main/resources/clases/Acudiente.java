/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gapxgestioncolegiosweb.domain;

import clases.TipoParentesco;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author laygrana
 */
@Entity
@Table(name = "acudiente")
public class Acudiente implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "acudiente_id")
    private Integer acudienteId;

    @JoinColumn(name = "persona_id", referencedColumnName = "persona_id")
    @OneToOne(optional = false, fetch = FetchType.EAGER)
    private Persona personaId;
    
    @JoinColumn(name = "tipo_parentesco_id", referencedColumnName = "tipo_parentesco_id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private TipoParentesco tipoParentescoId;

    public Acudiente() {
    }

    public Acudiente(Integer acudienteId) {
        this.acudienteId = acudienteId;
    }

    public Integer getAcudienteId() {
        return acudienteId;
    }

    public void setAcudienteId(Integer acudienteId) {
        this.acudienteId = acudienteId;
    }

    public Persona getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Persona personaId) {
        this.personaId = personaId;
    }

    public TipoParentesco getTipoParentescoId() {
        return tipoParentescoId;
    }

    public void setTipoParentescoId(TipoParentesco tipoParentescoId) {
        this.tipoParentescoId = tipoParentescoId;
    }
    
}
