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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author laygrana
 */
@Entity
public class Colegio implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "colegio_id")
    private Long id;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
    
    @Size(max = 50)
    @Column(name = "codigo_dane")
    private String codigoDane;
    
    @Size(max = 50)
    @Column(name = "dane_anterior")
    private String daneAnterior;
    
    @Lob
    @Size(max = 65535)
    @Column(name = "path_logo")
    private String pathLogo;
    
    @Lob
    @Size(max = 65535)
    @Column(name = "ruta_archivos_generados")
    private String rutaArchivosGenerados;
    
    @Size(max = 50)
    @Column(name = "telefono")
    private String telefono;
    
    @Size(max = 500)
    @Column(name = "direccion")
    private String direccion;
    
    @JoinColumn(name = "municipio_id", referencedColumnName = "municipio_id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Municipio municipio;
    
    public Colegio() {
    }

    public Colegio(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoDane() {
        return codigoDane;
    }

    public void setCodigoDane(String codigoDane) {
        this.codigoDane = codigoDane;
    }

    public String getDaneAnterior() {
        return daneAnterior;
    }

    public void setDaneAnterior(String daneAnterior) {
        this.daneAnterior = daneAnterior;
    }

    public String getPathLogo() {
        return pathLogo;
    }

    public void setPathLogo(String pathLogo) {
        this.pathLogo = pathLogo;
    }

    public String getRutaArchivosGenerados() {
        return rutaArchivosGenerados;
    }

    public void setRutaArchivosGenerados(String rutaArchivosGenerados) {
        this.rutaArchivosGenerados = rutaArchivosGenerados;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
    
}
