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
import javax.persistence.ManyToMany;
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
@Table(name = "CURSO", catalog = "DBsiscontrol", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Curso.findAll", query = "SELECT c FROM Curso c"),
    @NamedQuery(name = "Curso.findByIdCURSO", query = "SELECT c FROM Curso c WHERE c.idCURSO = :idCURSO"),
    @NamedQuery(name = "Curso.findByCodigo", query = "SELECT c FROM Curso c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "Curso.findByNombre", query = "SELECT c FROM Curso c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Curso.findByCiclo", query = "SELECT c FROM Curso c WHERE c.ciclo = :ciclo"),
    @NamedQuery(name = "Curso.findByCredito", query = "SELECT c FROM Curso c WHERE c.credito = :credito"),
    @NamedQuery(name = "Curso.findByRequisito", query = "SELECT c FROM Curso c WHERE c.requisito = :requisito"),
    @NamedQuery(name = "Curso.findByActivo", query = "SELECT c FROM Curso c WHERE c.activo = :activo")})
public class Curso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCURSO")
    private Integer idCURSO;
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "CICLO")
    private Integer ciclo;
    @Column(name = "CREDITO")
    private Integer credito;
    @Column(name = "REQUISITO")
    private String requisito;
    @Column(name = "ACTIVO")
    private Integer activo;
    @ManyToMany(mappedBy = "cursoList")
    private List<Usuario> usuarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cURSOidCURSO")
    private List<Silabo> silaboList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cURSOidCURSO")
    private List<Clase> claseList;
    @JoinColumn(name = "CARRERA_idCARRERA", referencedColumnName = "idCARRERA")
    @ManyToOne(optional = false)
    private Carrera cARRERAidCARRERA;

    public Curso() {
    }

    public Curso(Integer idCURSO) {
        this.idCURSO = idCURSO;
    }

    public Integer getIdCURSO() {
        return idCURSO;
    }

    public void setIdCURSO(Integer idCURSO) {
        this.idCURSO = idCURSO;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCiclo() {
        return ciclo;
    }

    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }

    public Integer getCredito() {
        return credito;
    }

    public void setCredito(Integer credito) {
        this.credito = credito;
    }

    public String getRequisito() {
        return requisito;
    }

    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @XmlTransient
    public List<Silabo> getSilaboList() {
        return silaboList;
    }

    public void setSilaboList(List<Silabo> silaboList) {
        this.silaboList = silaboList;
    }

    @XmlTransient
    public List<Clase> getClaseList() {
        return claseList;
    }

    public void setClaseList(List<Clase> claseList) {
        this.claseList = claseList;
    }

    public Carrera getCARRERAidCARRERA() {
        return cARRERAidCARRERA;
    }

    public void setCARRERAidCARRERA(Carrera cARRERAidCARRERA) {
        this.cARRERAidCARRERA = cARRERAidCARRERA;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCURSO != null ? idCURSO.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Curso)) {
            return false;
        }
        Curso other = (Curso) object;
        if ((this.idCURSO == null && other.idCURSO != null) || (this.idCURSO != null && !this.idCURSO.equals(other.idCURSO))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.controlasistencia.entities.Curso[ idCURSO=" + idCURSO + " ]";
    }
    
}
