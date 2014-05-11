/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.controlasistencia.entities;

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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tigabytes-linux
 */
@Entity
@Table(name = "ADMIN_ASISTENCIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdminAsistencia.findAll", query = "SELECT a FROM AdminAsistencia a"),
    @NamedQuery(name = "AdminAsistencia.findByIdADMINASISTENCIA", query = "SELECT a FROM AdminAsistencia a WHERE a.idADMINASISTENCIA = :idADMINASISTENCIA"),
    @NamedQuery(name = "AdminAsistencia.findByHorainicio", query = "SELECT a FROM AdminAsistencia a WHERE a.horainicio = :horainicio"),
    @NamedQuery(name = "AdminAsistencia.findByHorafin", query = "SELECT a FROM AdminAsistencia a WHERE a.horafin = :horafin")})
public class AdminAsistencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idADMIN_ASISTENCIA")
    private Integer idADMINASISTENCIA;
    @Column(name = "HORAINICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horainicio;
    @Column(name = "HORAFIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horafin;
    @JoinColumn(name = "USUARIO_ID", referencedColumnName = "USUARIO_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuarioId;

    public AdminAsistencia() {
    }

    public AdminAsistencia(Integer idADMINASISTENCIA) {
        this.idADMINASISTENCIA = idADMINASISTENCIA;
    }

    public Integer getIdADMINASISTENCIA() {
        return idADMINASISTENCIA;
    }

    public void setIdADMINASISTENCIA(Integer idADMINASISTENCIA) {
        this.idADMINASISTENCIA = idADMINASISTENCIA;
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

    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
        this.usuarioId = usuarioId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idADMINASISTENCIA != null ? idADMINASISTENCIA.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdminAsistencia)) {
            return false;
        }
        AdminAsistencia other = (AdminAsistencia) object;
        if ((this.idADMINASISTENCIA == null && other.idADMINASISTENCIA != null) || (this.idADMINASISTENCIA != null && !this.idADMINASISTENCIA.equals(other.idADMINASISTENCIA))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.controlasistencia.entities.AdminAsistencia[ idADMINASISTENCIA=" + idADMINASISTENCIA + " ]";
    }
    
}
