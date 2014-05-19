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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "USUARIO", catalog = "DBsiscontrol", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByUsuarioId", query = "SELECT u FROM Usuario u WHERE u.usuarioId = :usuarioId"),
    @NamedQuery(name = "Usuario.findByLogonid", query = "SELECT u FROM Usuario u WHERE u.logonid = :logonid"),
    @NamedQuery(name = "Usuario.findByPasswrd", query = "SELECT u FROM Usuario u WHERE u.passwrd = :passwrd"),
    @NamedQuery(name = "Usuario.findByPreguntasec", query = "SELECT u FROM Usuario u WHERE u.preguntasec = :preguntasec"),
    @NamedQuery(name = "Usuario.findByRespuestasec", query = "SELECT u FROM Usuario u WHERE u.respuestasec = :respuestasec"),
    @NamedQuery(name = "Usuario.findByNombres", query = "SELECT u FROM Usuario u WHERE u.nombres = :nombres"),
    @NamedQuery(name = "Usuario.findByApepat", query = "SELECT u FROM Usuario u WHERE u.apepat = :apepat"),
    @NamedQuery(name = "Usuario.findByApemat", query = "SELECT u FROM Usuario u WHERE u.apemat = :apemat"),
    @NamedQuery(name = "Usuario.findByFechaingr", query = "SELECT u FROM Usuario u WHERE u.fechaingr = :fechaingr"),
    @NamedQuery(name = "Usuario.findByTelefono", query = "SELECT u FROM Usuario u WHERE u.telefono = :telefono"),
    @NamedQuery(name = "Usuario.findByFechanac", query = "SELECT u FROM Usuario u WHERE u.fechanac = :fechanac"),
    @NamedQuery(name = "Usuario.findByFechareg", query = "SELECT u FROM Usuario u WHERE u.fechareg = :fechareg"),
    @NamedQuery(name = "Usuario.findByFechaupdate", query = "SELECT u FROM Usuario u WHERE u.fechaupdate = :fechaupdate"),
    @NamedQuery(name = "Usuario.findByGradoins", query = "SELECT u FROM Usuario u WHERE u.gradoins = :gradoins"),
    @NamedQuery(name = "Usuario.findByEspecialidad", query = "SELECT u FROM Usuario u WHERE u.especialidad = :especialidad"),
    @NamedQuery(name = "Usuario.findByActivo", query = "SELECT u FROM Usuario u WHERE u.activo = :activo")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "USUARIO_ID")
    private Integer usuarioId;
    @Basic(optional = false)
    @Column(name = "LOGONID")
    private String logonid;
    @Basic(optional = false)
    @Column(name = "PASSWRD")
    private String passwrd;
    @Column(name = "PREGUNTASEC")
    private String preguntasec;
    @Column(name = "RESPUESTASEC")
    private String respuestasec;
    @Basic(optional = false)
    @Column(name = "NOMBRES")
    private String nombres;
    @Basic(optional = false)
    @Column(name = "APEPAT")
    private String apepat;
    @Basic(optional = false)
    @Column(name = "APEMAT")
    private String apemat;
    @Column(name = "FECHAINGR")
    @Temporal(TemporalType.DATE)
    private Date fechaingr;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "FECHANAC")
    @Temporal(TemporalType.DATE)
    private Date fechanac;
    @Basic(optional = false)
    @Column(name = "FECHAREG")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechareg;
    @Column(name = "FECHAUPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaupdate;
    @Column(name = "GRADOINS")
    private String gradoins;
    @Column(name = "ESPECIALIDAD")
    private String especialidad;
    @Basic(optional = false)
    @Column(name = "ACTIVO")
    private int activo;
    @JoinTable(name = "USUARIO_has_CURSO", joinColumns = {
        @JoinColumn(name = "USUARIO_ID", referencedColumnName = "USUARIO_ID")}, inverseJoinColumns = {
        @JoinColumn(name = "CURSO_idCURSO", referencedColumnName = "idCURSO")})
    @ManyToMany
    private List<Curso> cursoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioId")
    private List<AdminAsistencia> adminAsistenciaList;
    @JoinColumn(name = "UBIGEO_ID", referencedColumnName = "UBIGEO_ID")
    @ManyToOne
    private Ubigeo ubigeoId;
    @JoinColumn(name = "PERFIL_ID", referencedColumnName = "PERFIL_ID")
    @ManyToOne(optional = false)
    private Perfil perfilId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioId")
    private List<Auditoria> auditoriaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioId")
    private List<Recurso> recursoList;

    public Usuario() {
    }

    public Usuario(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Usuario(Integer usuarioId, String logonid, String passwrd, String nombres, String apepat, String apemat, Date fechareg, int activo) {
        this.usuarioId = usuarioId;
        this.logonid = logonid;
        this.passwrd = passwrd;
        this.nombres = nombres;
        this.apepat = apepat;
        this.apemat = apemat;
        this.fechareg = fechareg;
        this.activo = activo;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getLogonid() {
        return logonid;
    }

    public void setLogonid(String logonid) {
        this.logonid = logonid;
    }

    public String getPasswrd() {
        return passwrd;
    }

    public void setPasswrd(String passwrd) {
        this.passwrd = passwrd;
    }

    public String getPreguntasec() {
        return preguntasec;
    }

    public void setPreguntasec(String preguntasec) {
        this.preguntasec = preguntasec;
    }

    public String getRespuestasec() {
        return respuestasec;
    }

    public void setRespuestasec(String respuestasec) {
        this.respuestasec = respuestasec;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApepat() {
        return apepat;
    }

    public void setApepat(String apepat) {
        this.apepat = apepat;
    }

    public String getApemat() {
        return apemat;
    }

    public void setApemat(String apemat) {
        this.apemat = apemat;
    }

    public Date getFechaingr() {
        return fechaingr;
    }

    public void setFechaingr(Date fechaingr) {
        this.fechaingr = fechaingr;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    public Date getFechareg() {
        return fechareg;
    }

    public void setFechareg(Date fechareg) {
        this.fechareg = fechareg;
    }

    public Date getFechaupdate() {
        return fechaupdate;
    }

    public void setFechaupdate(Date fechaupdate) {
        this.fechaupdate = fechaupdate;
    }

    public String getGradoins() {
        return gradoins;
    }

    public void setGradoins(String gradoins) {
        this.gradoins = gradoins;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    @XmlTransient
    public List<Curso> getCursoList() {
        return cursoList;
    }

    public void setCursoList(List<Curso> cursoList) {
        this.cursoList = cursoList;
    }

    @XmlTransient
    public List<AdminAsistencia> getAdminAsistenciaList() {
        return adminAsistenciaList;
    }

    public void setAdminAsistenciaList(List<AdminAsistencia> adminAsistenciaList) {
        this.adminAsistenciaList = adminAsistenciaList;
    }

    public Ubigeo getUbigeoId() {
        return ubigeoId;
    }

    public void setUbigeoId(Ubigeo ubigeoId) {
        this.ubigeoId = ubigeoId;
    }

    public Perfil getPerfilId() {
        return perfilId;
    }

    public void setPerfilId(Perfil perfilId) {
        this.perfilId = perfilId;
    }

    @XmlTransient
    public List<Auditoria> getAuditoriaList() {
        return auditoriaList;
    }

    public void setAuditoriaList(List<Auditoria> auditoriaList) {
        this.auditoriaList = auditoriaList;
    }

    @XmlTransient
    public List<Recurso> getRecursoList() {
        return recursoList;
    }

    public void setRecursoList(List<Recurso> recursoList) {
        this.recursoList = recursoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuarioId != null ? usuarioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.usuarioId == null && other.usuarioId != null) || (this.usuarioId != null && !this.usuarioId.equals(other.usuarioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.controlasistencia.entities.Usuario[ usuarioId=" + usuarioId + " ]";
    }
    
}
