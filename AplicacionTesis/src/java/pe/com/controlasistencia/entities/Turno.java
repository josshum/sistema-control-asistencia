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
@Table(name = "TURNO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Turno.findAll", query = "SELECT t FROM Turno t"),
    @NamedQuery(name = "Turno.findByIdTURNO", query = "SELECT t FROM Turno t WHERE t.idTURNO = :idTURNO"),
    @NamedQuery(name = "Turno.findByNombre", query = "SELECT t FROM Turno t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Turno.findByHorainicio", query = "SELECT t FROM Turno t WHERE t.horainicio = :horainicio"),
    @NamedQuery(name = "Turno.findByHorafin", query = "SELECT t FROM Turno t WHERE t.horafin = :horafin"),
    @NamedQuery(name = "Turno.findByActivo", query = "SELECT t FROM Turno t WHERE t.activo = :activo")})
public class Turno implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTURNO")
    private Integer idTURNO;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "HORAINICIO")
    @Temporal(TemporalType.DATE)
    private Date horainicio;
    @Column(name = "HORAFIN")
    @Temporal(TemporalType.DATE)
    private Date horafin;
    @Column(name = "ACTIVO")
    private Integer activo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tURNOidTURNO", fetch = FetchType.LAZY)
    private List<Clase> claseList;

    public Turno() {
    }

    public Turno(Integer idTURNO) {
        this.idTURNO = idTURNO;
    }

    public Integer getIdTURNO() {
        return idTURNO;
    }

    public void setIdTURNO(Integer idTURNO) {
        this.idTURNO = idTURNO;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(Date horainicio) {
        this.horainicio = horainicio;
    }

    public Date getHorafin() {
        return horafin;
    }

    public void setHorafin(Date horafin) {
        this.horafin = horafin;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    @XmlTransient
    public List<Clase> getClaseList() {
        return claseList;
    }

    public void setClaseList(List<Clase> claseList) {
        this.claseList = claseList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTURNO != null ? idTURNO.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Turno)) {
            return false;
        }
        Turno other = (Turno) object;
        if ((this.idTURNO == null && other.idTURNO != null) || (this.idTURNO != null && !this.idTURNO.equals(other.idTURNO))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.controlasistencia.entities.Turno[ idTURNO=" + idTURNO + " ]";
    }
    
}
