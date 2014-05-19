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
import javax.persistence.Lob;
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
@Table(name = "SILABO", catalog = "DBsiscontrol", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Silabo.findAll", query = "SELECT s FROM Silabo s"),
    @NamedQuery(name = "Silabo.findByIdSILABO", query = "SELECT s FROM Silabo s WHERE s.idSILABO = :idSILABO"),
    @NamedQuery(name = "Silabo.findByNombre", query = "SELECT s FROM Silabo s WHERE s.nombre = :nombre"),
    @NamedQuery(name = "Silabo.findByHorasacad", query = "SELECT s FROM Silabo s WHERE s.horasacad = :horasacad"),
    @NamedQuery(name = "Silabo.findBySemanas", query = "SELECT s FROM Silabo s WHERE s.semanas = :semanas"),
    @NamedQuery(name = "Silabo.findByActivo", query = "SELECT s FROM Silabo s WHERE s.activo = :activo")})
public class Silabo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idSILABO")
    private Integer idSILABO;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "HORASACAD")
    private Integer horasacad;
    @Column(name = "SEMANAS")
    private Integer semanas;
    @Lob
    @Column(name = "ADJUNTO")
    private byte[] adjunto;
    @Column(name = "ACTIVO")
    private Integer activo;
    @JoinColumn(name = "CURSO_idCURSO", referencedColumnName = "idCURSO")
    @ManyToOne(optional = false)
    private Curso cURSOidCURSO;

    public Silabo() {
    }

    public Silabo(Integer idSILABO) {
        this.idSILABO = idSILABO;
    }

    public Integer getIdSILABO() {
        return idSILABO;
    }

    public void setIdSILABO(Integer idSILABO) {
        this.idSILABO = idSILABO;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getHorasacad() {
        return horasacad;
    }

    public void setHorasacad(Integer horasacad) {
        this.horasacad = horasacad;
    }

    public Integer getSemanas() {
        return semanas;
    }

    public void setSemanas(Integer semanas) {
        this.semanas = semanas;
    }

    public byte[] getAdjunto() {
        return adjunto;
    }

    public void setAdjunto(byte[] adjunto) {
        this.adjunto = adjunto;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public Curso getCURSOidCURSO() {
        return cURSOidCURSO;
    }

    public void setCURSOidCURSO(Curso cURSOidCURSO) {
        this.cURSOidCURSO = cURSOidCURSO;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSILABO != null ? idSILABO.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Silabo)) {
            return false;
        }
        Silabo other = (Silabo) object;
        if ((this.idSILABO == null && other.idSILABO != null) || (this.idSILABO != null && !this.idSILABO.equals(other.idSILABO))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.controlasistencia.entities.Silabo[ idSILABO=" + idSILABO + " ]";
    }
    
}
