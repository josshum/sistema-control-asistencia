/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.controlasistencia.entities;

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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tigabytes-linux
 */
@Entity
@Table(name = "TIPOSALON")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiposalon.findAll", query = "SELECT t FROM Tiposalon t"),
    @NamedQuery(name = "Tiposalon.findByIdTIPO", query = "SELECT t FROM Tiposalon t WHERE t.idTIPO = :idTIPO"),
    @NamedQuery(name = "Tiposalon.findByNombre", query = "SELECT t FROM Tiposalon t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tiposalon.findByDescripcion", query = "SELECT t FROM Tiposalon t WHERE t.descripcion = :descripcion")})
public class Tiposalon implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTIPO")
    private Integer idTIPO;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @JoinColumn(name = "SALON_idSALON", referencedColumnName = "idSALON")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Salon sALONidSALON;

    public Tiposalon() {
    }

    public Tiposalon(Integer idTIPO) {
        this.idTIPO = idTIPO;
    }

    public Integer getIdTIPO() {
        return idTIPO;
    }

    public void setIdTIPO(Integer idTIPO) {
        this.idTIPO = idTIPO;
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

    public Salon getSALONidSALON() {
        return sALONidSALON;
    }

    public void setSALONidSALON(Salon sALONidSALON) {
        this.sALONidSALON = sALONidSALON;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTIPO != null ? idTIPO.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiposalon)) {
            return false;
        }
        Tiposalon other = (Tiposalon) object;
        if ((this.idTIPO == null && other.idTIPO != null) || (this.idTIPO != null && !this.idTIPO.equals(other.idTIPO))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.controlasistencia.entities.Tiposalon[ idTIPO=" + idTIPO + " ]";
    }
    
}
