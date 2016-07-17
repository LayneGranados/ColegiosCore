/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import com.gapxgestioncolegiosweb.domain.Persona;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author laygrana
 */
@Entity
@Table(name = "profesor")
public class Profesor implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "profesor_id")
    private Integer profesorId;
    
    @JoinColumn(name = "persona_id", referencedColumnName = "persona_id")
    @OneToOne(optional = false, fetch = FetchType.EAGER)
    private Persona personaId;
    
    public Profesor() {
    }

    public Profesor(Integer profesorId) {
        this.profesorId = profesorId;
    }

    public Integer getProfesorId() {
        return profesorId;
    }

    public void setProfesorId(Integer profesorId) {
        this.profesorId = profesorId;
    }

    public Persona getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Persona personaId) {
        this.personaId = personaId;
    }
    
}
