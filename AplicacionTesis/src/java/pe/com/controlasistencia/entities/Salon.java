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
@Table(name = "SALON", catalog = "DBsiscontrol", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salon.findAll", query = "SELECT s FROM Salon s"),
    @NamedQuery(name = "Salon.findByIdSALON", query = "SELECT s FROM Salon s WHERE s.idSALON = :idSALON"),
    @NamedQuery(name = "Salon.findByNumero", query = "SELECT s FROM Salon s WHERE s.numero = :numero"),
    @NamedQuery(name = "Salon.findByCapacidad", query = "SELECT s FROM Salon s WHERE s.capacidad = :capacidad")})
public class Salon implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idSALON")
    private Integer idSALON;
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "CAPACIDAD")
    private Integer capacidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sALONidSALON")
    private List<Clase> claseList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sALONidSALON")
    private List<Tiposalon> tiposalonList;

    public Salon() {
    }

    public Salon(Integer idSALON) {
        this.idSALON = idSALON;
    }

    public Integer getIdSALON() {
        return idSALON;
    }

    public void setIdSALON(Integer idSALON) {
        this.idSALON = idSALON;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    @XmlTransient
    public List<Clase> getClaseList() {
        return claseList;
    }

    public void setClaseList(List<Clase> claseList) {
        this.claseList = claseList;
    }

    @XmlTransient
    public List<Tiposalon> getTiposalonList() {
        return tiposalonList;
    }

    public void setTiposalonList(List<Tiposalon> tiposalonList) {
        this.tiposalonList = tiposalonList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSALON != null ? idSALON.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salon)) {
            return false;
        }
        Salon other = (Salon) object;
        if ((this.idSALON == null && other.idSALON != null) || (this.idSALON != null && !this.idSALON.equals(other.idSALON))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.controlasistencia.entities.Salon[ idSALON=" + idSALON + " ]";
    }
    
}
