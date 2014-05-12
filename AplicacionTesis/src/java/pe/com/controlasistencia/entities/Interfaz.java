/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.controlasistencia.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author tigabytes-linux
 */
@Entity
@Table(name = "INTERFAZ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Interfaz.findAll", query = "SELECT i FROM Interfaz i"),
    @NamedQuery(name = "Interfaz.findByInterfazId", query = "SELECT i FROM Interfaz i WHERE i.interfazId = :interfazId"),
    @NamedQuery(name = "Interfaz.findByNombre", query = "SELECT i FROM Interfaz i WHERE i.nombre = :nombre"),
    @NamedQuery(name = "Interfaz.findByTitulo", query = "SELECT i FROM Interfaz i WHERE i.titulo = :titulo"),
    @NamedQuery(name = "Interfaz.findByPath", query = "SELECT i FROM Interfaz i WHERE i.path = :path"),
    @NamedQuery(name = "Interfaz.findByActivo", query = "SELECT i FROM Interfaz i WHERE i.activo = :activo"),
    @NamedQuery(name = "Interfaz.findByFechareg", query = "SELECT i FROM Interfaz i WHERE i.fechareg = :fechareg"),
    @NamedQuery(name = "Interfaz.findByFechaupdate", query = "SELECT i FROM Interfaz i WHERE i.fechaupdate = :fechaupdate")})
public class Interfaz implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "INTERFAZ_ID")
    private Integer interfazId;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "TITULO")
    private String titulo;
    @Column(name = "PATH")
    private String path;
    @Basic(optional = false)
    @Column(name = "ACTIVO")
    private int activo;
    @Column(name = "FECHAREG")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechareg;
    @Column(name = "FECHAUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaupdate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "interfazId", fetch = FetchType.LAZY)
    private List<Permiso> permisoList;

    public Interfaz() {
    }

    public Interfaz(Integer interfazId) {
        this.interfazId = interfazId;
    }

    public Interfaz(Integer interfazId, int activo) {
        this.interfazId = interfazId;
        this.activo = activo;
    }

    public Integer getInterfazId() {
        return interfazId;
    }

    public void setInterfazId(Integer interfazId) {
        this.interfazId = interfazId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public Date getFechareg() {
        return fechareg;
    }

    public void setFechareg(Date fechareg) {
        this.fechareg = fechareg;
    }

    public Date getFechaupdate() {
        return fechaupdate;
    }

    public void setFechaupdate(Date fechaupdate) {
        this.fechaupdate = fechaupdate;
    }

    @XmlTransient
    public List<Permiso> getPermisoList() {
        return permisoList;
    }

    public void setPermisoList(List<Permiso> permisoList) {
        this.permisoList = permisoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (interfazId != null ? interfazId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Interfaz)) {
            return false;
        }
        Interfaz other = (Interfaz) object;
        if ((this.interfazId == null && other.interfazId != null) || (this.interfazId != null && !this.interfazId.equals(other.interfazId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.controlasistencia.entities.Interfaz[ interfazId=" + interfazId + " ]";
    }
    
}
