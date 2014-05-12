/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.controlasistencia.entities;

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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author tigabytes-linux
 */
@Entity
@Table(name = "CARRERA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carrera.findAll", query = "SELECT c FROM Carrera c"),
    @NamedQuery(name = "Carrera.findByIdCARRERA", query = "SELECT c FROM Carrera c WHERE c.idCARRERA = :idCARRERA"),
    @NamedQuery(name = "Carrera.findByNombre", query = "SELECT c FROM Carrera c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Carrera.findByDescripcion", query = "SELECT c FROM Carrera c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "Carrera.findByNumciclos", query = "SELECT c FROM Carrera c WHERE c.numciclos = :numciclos"),
    @NamedQuery(name = "Carrera.findByGrado", query = "SELECT c FROM Carrera c WHERE c.grado = :grado"),
    @NamedQuery(name = "Carrera.findByTotalcred", query = "SELECT c FROM Carrera c WHERE c.totalcred = :totalcred"),
    @NamedQuery(name = "Carrera.findByActivo", query = "SELECT c FROM Carrera c WHERE c.activo = :activo")})
public class Carrera implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCARRERA")
    private Integer idCARRERA;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "NUMCICLOS")
    private Integer numciclos;
    @Column(name = "GRADO")
    private Integer grado;
    @Column(name = "TOTALCRED")
    private Integer totalcred;
    @Column(name = "ACTIVO")
    private Integer activo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cARRERAidCARRERA", fetch = FetchType.LAZY)
    private List<Curso> cursoList;

    public Carrera() {
    }

    public Carrera(Integer idCARRERA) {
        this.idCARRERA = idCARRERA;
    }

    public Integer getIdCARRERA() {
        return idCARRERA;
    }

    public void setIdCARRERA(Integer idCARRERA) {
        this.idCARRERA = idCARRERA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getNumciclos() {
        return numciclos;
    }

    public void setNumciclos(Integer numciclos) {
        this.numciclos = numciclos;
    }

    public Integer getGrado() {
        return grado;
    }

    public void setGrado(Integer grado) {
        this.grado = grado;
    }

    public Integer getTotalcred() {
        return totalcred;
    }

    public void setTotalcred(Integer totalcred) {
        this.totalcred = totalcred;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    @XmlTransient
    public List<Curso> getCursoList() {
        return cursoList;
    }

    public void setCursoList(List<Curso> cursoList) {
        this.cursoList = cursoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCARRERA != null ? idCARRERA.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carrera)) {
            return false;
        }
        Carrera other = (Carrera) object;
        if ((this.idCARRERA == null && other.idCARRERA != null) || (this.idCARRERA != null && !this.idCARRERA.equals(other.idCARRERA))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.controlasistencia.entities.Carrera[ idCARRERA=" + idCARRERA + " ]";
    }
    
}
