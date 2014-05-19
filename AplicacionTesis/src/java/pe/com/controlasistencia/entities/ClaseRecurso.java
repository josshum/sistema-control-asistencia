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
@Table(name = "CLASE_RECURSO", catalog = "DBsiscontrol", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClaseRecurso.findAll", query = "SELECT c FROM ClaseRecurso c"),
    @NamedQuery(name = "ClaseRecurso.findByIdCLASERECURSO", query = "SELECT c FROM ClaseRecurso c WHERE c.idCLASERECURSO = :idCLASERECURSO"),
    @NamedQuery(name = "ClaseRecurso.findByCantidad", query = "SELECT c FROM ClaseRecurso c WHERE c.cantidad = :cantidad")})
public class ClaseRecurso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCLASE_RECURSO")
    private Integer idCLASERECURSO;
    @Column(name = "CANTIDAD")
    private Integer cantidad;
    @JoinColumn(name = "RECURSO_idRECURSO", referencedColumnName = "idRECURSO")
    @ManyToOne(optional = false)
    private Recurso rECURSOidRECURSO;
    @JoinColumn(name = "CLASE_idCLASE", referencedColumnName = "idCLASE")
    @ManyToOne(optional = false)
    private Clase cLASEidCLASE;

    public ClaseRecurso() {
    }

    public ClaseRecurso(Integer idCLASERECURSO) {
        this.idCLASERECURSO = idCLASERECURSO;
    }

    public Integer getIdCLASERECURSO() {
        return idCLASERECURSO;
    }

    public void setIdCLASERECURSO(Integer idCLASERECURSO) {
        this.idCLASERECURSO = idCLASERECURSO;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Recurso getRECURSOidRECURSO() {
        return rECURSOidRECURSO;
    }

    public void setRECURSOidRECURSO(Recurso rECURSOidRECURSO) {
        this.rECURSOidRECURSO = rECURSOidRECURSO;
    }

    public Clase getCLASEidCLASE() {
        return cLASEidCLASE;
    }

    public void setCLASEidCLASE(Clase cLASEidCLASE) {
        this.cLASEidCLASE = cLASEidCLASE;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCLASERECURSO != null ? idCLASERECURSO.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClaseRecurso)) {
            return false;
        }
        ClaseRecurso other = (ClaseRecurso) object;
        if ((this.idCLASERECURSO == null && other.idCLASERECURSO != null) || (this.idCLASERECURSO != null && !this.idCLASERECURSO.equals(other.idCLASERECURSO))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.controlasistencia.entities.ClaseRecurso[ idCLASERECURSO=" + idCLASERECURSO + " ]";
    }
    
}
