/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author laygrana
 */
@Entity
@Table(name = "tipo_parentesco")
public class TipoParentesco implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tipo_parentesco_id")
    private Integer tipoParentescoId;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
 
    public TipoParentesco() {
    }

    public TipoParentesco(Integer tipoParentescoId) {
        this.tipoParentescoId = tipoParentescoId;
    }

    public TipoParentesco(Integer tipoParentescoId, String nombre) {
        this.tipoParentescoId = tipoParentescoId;
        this.nombre = nombre;
    }

    public Integer getTipoParentescoId() {
        return tipoParentescoId;
    }

    public void setTipoParentescoId(Integer tipoParentescoId) {
        this.tipoParentescoId = tipoParentescoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
