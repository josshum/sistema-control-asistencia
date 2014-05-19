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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "RECURSO", catalog = "DBsiscontrol", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Recurso.findAll", query = "SELECT r FROM Recurso r"),
    @NamedQuery(name = "Recurso.findByIdRECURSO", query = "SELECT r FROM Recurso r WHERE r.idRECURSO = :idRECURSO"),
    @NamedQuery(name = "Recurso.findByNombre", query = "SELECT r FROM Recurso r WHERE r.nombre = :nombre"),
    @NamedQuery(name = "Recurso.findByDescripcion", query = "SELECT r FROM Recurso r WHERE r.descripcion = :descripcion"),
    @NamedQuery(name = "Recurso.findByEstado", query = "SELECT r FROM Recurso r WHERE r.estado = :estado")})
public class Recurso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRECURSO")
    private Integer idRECURSO;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ESTADO")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rECURSOidRECURSO")
    private List<ClaseRecurso> claseRecursoList;
    @JoinColumn(name = "USUARIO_ID", referencedColumnName = "USUARIO_ID")
    @ManyToOne(optional = false)
    private Usuario usuarioId;

    public Recurso() {
    }

    public Recurso(Integer idRECURSO) {
        this.idRECURSO = idRECURSO;
    }

    public Integer getIdRECURSO() {
        return idRECURSO;
    }

    public void setIdRECURSO(Integer idRECURSO) {
        this.idRECURSO = idRECURSO;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<ClaseRecurso> getClaseRecursoList() {
        return claseRecursoList;
    }

    public void setClaseRecursoList(List<ClaseRecurso> claseRecursoList) {
        this.claseRecursoList = claseRecursoList;
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
        hash += (idRECURSO != null ? idRECURSO.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recurso)) {
            return false;
        }
        Recurso other = (Recurso) object;
        if ((this.idRECURSO == null && other.idRECURSO != null) || (this.idRECURSO != null && !this.idRECURSO.equals(other.idRECURSO))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.controlasistencia.entities.Recurso[ idRECURSO=" + idRECURSO + " ]";
    }
    
}
