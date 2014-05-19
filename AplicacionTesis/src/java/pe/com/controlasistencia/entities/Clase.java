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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "CLASE", catalog = "DBsiscontrol", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clase.findAll", query = "SELECT c FROM Clase c"),
    @NamedQuery(name = "Clase.findByIdCLASE", query = "SELECT c FROM Clase c WHERE c.idCLASE = :idCLASE"),
    @NamedQuery(name = "Clase.findByNombre", query = "SELECT c FROM Clase c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Clase.findByNumeroclase", query = "SELECT c FROM Clase c WHERE c.numeroclase = :numeroclase"),
    @NamedQuery(name = "Clase.findByHoraini", query = "SELECT c FROM Clase c WHERE c.horaini = :horaini"),
    @NamedQuery(name = "Clase.findByHorafin", query = "SELECT c FROM Clase c WHERE c.horafin = :horafin")})
public class Clase implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCLASE")
    private Integer idCLASE;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "NUMEROCLASE")
    private Integer numeroclase;
    @Column(name = "HORAINI")
    @Temporal(TemporalType.TIME)
    private Date horaini;
    @Column(name = "HORAFIN")
    @Temporal(TemporalType.TIME)
    private Date horafin;
    @JoinColumn(name = "TURNO_idTURNO", referencedColumnName = "idTURNO")
    @ManyToOne(optional = false)
    private Turno tURNOidTURNO;
    @JoinColumn(name = "SALON_idSALON", referencedColumnName = "idSALON")
    @ManyToOne(optional = false)
    private Salon sALONidSALON;
    @JoinColumn(name = "CURSO_idCURSO", referencedColumnName = "idCURSO")
    @ManyToOne(optional = false)
    private Curso cURSOidCURSO;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cLASEidCLASE")
    private List<ClaseRecurso> claseRecursoList;

    public Clase() {
    }

    public Clase(Integer idCLASE) {
        this.idCLASE = idCLASE;
    }

    public Integer getIdCLASE() {
        return idCLASE;
    }

    public void setIdCLASE(Integer idCLASE) {
        this.idCLASE = idCLASE;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumeroclase() {
        return numeroclase;
    }

    public void setNumeroclase(Integer numeroclase) {
        this.numeroclase = numeroclase;
    }

    public Date getHoraini() {
        return horaini;
    }

    public void setHoraini(Date horaini) {
        this.horaini = horaini;
    }

    public Date getHorafin() {
        return horafin;
    }

    public void setHorafin(Date horafin) {
        this.horafin = horafin;
    }

    public Turno getTURNOidTURNO() {
        return tURNOidTURNO;
    }

    public void setTURNOidTURNO(Turno tURNOidTURNO) {
        this.tURNOidTURNO = tURNOidTURNO;
    }

    public Salon getSALONidSALON() {
        return sALONidSALON;
    }

    public void setSALONidSALON(Salon sALONidSALON) {
        this.sALONidSALON = sALONidSALON;
    }

    public Curso getCURSOidCURSO() {
        return cURSOidCURSO;
    }

    public void setCURSOidCURSO(Curso cURSOidCURSO) {
        this.cURSOidCURSO = cURSOidCURSO;
    }

    @XmlTransient
    public List<ClaseRecurso> getClaseRecursoList() {
        return claseRecursoList;
    }

    public void setClaseRecursoList(List<ClaseRecurso> claseRecursoList) {
        this.claseRecursoList = claseRecursoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCLASE != null ? idCLASE.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clase)) {
            return false;
        }
        Clase other = (Clase) object;
        if ((this.idCLASE == null && other.idCLASE != null) || (this.idCLASE != null && !this.idCLASE.equals(other.idCLASE))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.controlasistencia.entities.Clase[ idCLASE=" + idCLASE + " ]";
    }
    
}
