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
@Table(name = "UBIGEO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ubigeo.findAll", query = "SELECT u FROM Ubigeo u"),
    @NamedQuery(name = "Ubigeo.findByUbigeoId", query = "SELECT u FROM Ubigeo u WHERE u.ubigeoId = :ubigeoId"),
    @NamedQuery(name = "Ubigeo.findByDeptoId", query = "SELECT u FROM Ubigeo u WHERE u.deptoId = :deptoId"),
    @NamedQuery(name = "Ubigeo.findByProvId", query = "SELECT u FROM Ubigeo u WHERE u.provId = :provId"),
    @NamedQuery(name = "Ubigeo.findByDistritoId", query = "SELECT u FROM Ubigeo u WHERE u.distritoId = :distritoId"),
    @NamedQuery(name = "Ubigeo.findByNombre", query = "SELECT u FROM Ubigeo u WHERE u.nombre = :nombre")})
public class Ubigeo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "UBIGEO_ID")
    private Integer ubigeoId;
    @Basic(optional = false)
    @Column(name = "DEPTO_ID")
    private int deptoId;
    @Basic(optional = false)
    @Column(name = "PROV_ID")
    private int provId;
    @Basic(optional = false)
    @Column(name = "DISTRITO_ID")
    private int distritoId;
    @Column(name = "NOMBRE")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ubigeoId", fetch = FetchType.LAZY)
    private List<Usuario> usuarioList;

    public Ubigeo() {
    }

    public Ubigeo(Integer ubigeoId) {
        this.ubigeoId = ubigeoId;
    }

    public Ubigeo(Integer ubigeoId, int deptoId, int provId, int distritoId) {
        this.ubigeoId = ubigeoId;
        this.deptoId = deptoId;
        this.provId = provId;
        this.distritoId = distritoId;
    }

    public Integer getUbigeoId() {
        return ubigeoId;
    }

    public void setUbigeoId(Integer ubigeoId) {
        this.ubigeoId = ubigeoId;
    }

    public int getDeptoId() {
        return deptoId;
    }

    public void setDeptoId(int deptoId) {
        this.deptoId = deptoId;
    }

    public int getProvId() {
        return provId;
    }

    public void setProvId(int provId) {
        this.provId = provId;
    }

    public int getDistritoId() {
        return distritoId;
    }

    public void setDistritoId(int distritoId) {
        this.distritoId = distritoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ubigeoId != null ? ubigeoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ubigeo)) {
            return false;
        }
        Ubigeo other = (Ubigeo) object;
        if ((this.ubigeoId == null && other.ubigeoId != null) || (this.ubigeoId != null && !this.ubigeoId.equals(other.ubigeoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.controlasistencia.entities.Ubigeo[ ubigeoId=" + ubigeoId + " ]";
    }
    
}
