/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gapxgestioncolegiosweb.domain;

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
import javax.validation.constraints.Size;

/**
 *
 * @author laygrana
 */
@Entity
@Table(name = "persona")
public class Persona implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "persona_id")
    private Long id;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "documento")
    private String documento;
    
    @Size(max = 10)
    @Column(name = "exp_depto")
    private String expDepto;
    
    @Size(max = 10)
    @Column(name = "exp_mun")
    private String expMun;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre1")
    private String nombre1;
    
    @Size(max = 100)
    @Column(name = "nombre2")
    private String nombre2;
    
    @Size(max = 100)
    @Column(name = "apellido1")
    private String apellido1;
    
    @Size(max = 50)
    @Column(name = "apellido2")
    private String apellido2;
    
    @Size(max = 100)
    @Column(name = "direccion_residencia")
    private String direccionResidencia;
    
    @Size(max = 10)
    @Column(name = "res_depto")
    private String resDepto;
    
    @Size(max = 10)
    @Column(name = "res_mun")
    private String resMun;
    
    @Size(max = 2)
    @Column(name = "estrato")
    private String estrato;
    
    @Size(max = 2)
    @Column(name = "sisben")
    private String sisben;
    
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    
    @Size(max = 3)
    @Column(name = "nac_depto")
    private String nacDepto;
    
    @Size(max = 3)
    @Column(name = "nac_mun")
    private String nacMun;
    
    @Size(max = 1)
    @Column(name = "genero")
    private String genero;
    
    @Column(name = "etnia_id")
    private Integer etniaId;
    
    @Column(name = "resguardo_id")
    private Integer resguardoId;
    
    @Size(max = 1)
    @Column(name = "tipo_persona")
    private String tipoPersona;
    
    @Size(max = 50)
    @Column(name = "telefono_residencia")
    private String telefonoResidencia;
    
    @JoinColumn(name = "tipo_documento_id", referencedColumnName = "tipo_documento_id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private TipoDocumento tipoDocumento;
    

    public Persona() {
    }

    public Persona(Long id) {
        this.id = id;
    }

    public Persona(Long id, String documento, String nombre1) {
        this.id = id;
        this.documento = documento;
        this.nombre1 = nombre1;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getExpDepto() {
        return expDepto;
    }

    public void setExpDepto(String expDepto) {
        this.expDepto = expDepto;
    }

    public String getExpMun() {
        return expMun;
    }

    public void setExpMun(String expMun) {
        this.expMun = expMun;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public String getResDepto() {
        return resDepto;
    }

    public void setResDepto(String resDepto) {
        this.resDepto = resDepto;
    }

    public String getResMun() {
        return resMun;
    }

    public void setResMun(String resMun) {
        this.resMun = resMun;
    }

    public String getEstrato() {
        return estrato;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
    }

    public String getSisben() {
        return sisben;
    }

    public void setSisben(String sisben) {
        this.sisben = sisben;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacDepto() {
        return nacDepto;
    }

    public void setNacDepto(String nacDepto) {
        this.nacDepto = nacDepto;
    }

    public String getNacMun() {
        return nacMun;
    }

    public void setNacMun(String nacMun) {
        this.nacMun = nacMun;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getEtniaId() {
        return etniaId;
    }

    public void setEtniaId(Integer etniaId) {
        this.etniaId = etniaId;
    }

    public Integer getResguardoId() {
        return resguardoId;
    }

    public void setResguardoId(Integer resguardoId) {
        this.resguardoId = resguardoId;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getTelefonoResidencia() {
        return telefonoResidencia;
    }

    public void setTelefonoResidencia(String telefonoResidencia) {
        this.telefonoResidencia = telefonoResidencia;
    }

}
