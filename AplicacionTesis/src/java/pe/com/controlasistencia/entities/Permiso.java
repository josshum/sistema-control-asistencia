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
@Table(name = "PERMISO", catalog = "DBsiscontrol", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Permiso.findAll", query = "SELECT p FROM Permiso p"),
    @NamedQuery(name = "Permiso.findByPermisoId", query = "SELECT p FROM Permiso p WHERE p.permisoId = :permisoId"),
    @NamedQuery(name = "Permiso.findByVer", query = "SELECT p FROM Permiso p WHERE p.ver = :ver"),
    @NamedQuery(name = "Permiso.findByCrear", query = "SELECT p FROM Permiso p WHERE p.crear = :crear"),
    @NamedQuery(name = "Permiso.findByModificar", query = "SELECT p FROM Permiso p WHERE p.modificar = :modificar"),
    @NamedQuery(name = "Permiso.findByEliminar", query = "SELECT p FROM Permiso p WHERE p.eliminar = :eliminar"),
    @NamedQuery(name = "Permiso.findByImprimir", query = "SELECT p FROM Permiso p WHERE p.imprimir = :imprimir"),
    @NamedQuery(name = "Permiso.findByExportar", query = "SELECT p FROM Permiso p WHERE p.exportar = :exportar")})
public class Permiso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PERMISO_ID")
    private Integer permisoId;
    @Basic(optional = false)
    @Column(name = "VER")
    private short ver;
    @Column(name = "CREAR")
    private Short crear;
    @Column(name = "MODIFICAR")
    private Short modificar;
    @Column(name = "ELIMINAR")
    private Short eliminar;
    @Column(name = "IMPRIMIR")
    private Short imprimir;
    @Column(name = "EXPORTAR")
    private Short exportar;
    @JoinColumn(name = "PERFIL_ID", referencedColumnName = "PERFIL_ID")
    @ManyToOne(optional = false)
    private Perfil perfilId;
    @JoinColumn(name = "INTERFAZ_ID", referencedColumnName = "INTERFAZ_ID")
    @ManyToOne(optional = false)
    private Interfaz interfazId;

    public Permiso() {
    }

    public Permiso(Integer permisoId) {
        this.permisoId = permisoId;
    }

    public Permiso(Integer permisoId, short ver) {
        this.permisoId = permisoId;
        this.ver = ver;
    }

    public Integer getPermisoId() {
        return permisoId;
    }

    public void setPermisoId(Integer permisoId) {
        this.permisoId = permisoId;
    }

    public short getVer() {
        return ver;
    }

    public void setVer(short ver) {
        this.ver = ver;
    }

    public Short getCrear() {
        return crear;
    }

    public void setCrear(Short crear) {
        this.crear = crear;
    }

    public Short getModificar() {
        return modificar;
    }

    public void setModificar(Short modificar) {
        this.modificar = modificar;
    }

    public Short getEliminar() {
        return eliminar;
    }

    public void setEliminar(Short eliminar) {
        this.eliminar = eliminar;
    }

    public Short getImprimir() {
        return imprimir;
    }

    public void setImprimir(Short imprimir) {
        this.imprimir = imprimir;
    }

    public Short getExportar() {
        return exportar;
    }

    public void setExportar(Short exportar) {
        this.exportar = exportar;
    }

    public Perfil getPerfilId() {
        return perfilId;
    }

    public void setPerfilId(Perfil perfilId) {
        this.perfilId = perfilId;
    }

    public Interfaz getInterfazId() {
        return interfazId;
    }

    public void setInterfazId(Interfaz interfazId) {
        this.interfazId = interfazId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (permisoId != null ? permisoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permiso)) {
            return false;
        }
        Permiso other = (Permiso) object;
        if ((this.permisoId == null && other.permisoId != null) || (this.permisoId != null && !this.permisoId.equals(other.permisoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.controlasistencia.entities.Permiso[ permisoId=" + permisoId + " ]";
    }
    
}
