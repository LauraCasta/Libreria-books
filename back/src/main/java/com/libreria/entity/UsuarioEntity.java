package com.libreria.entity;

import javax.persistence.*;

@Entity
@Table(name = "USUARIOS")
public class UsuarioEntity {
    @Id
    @SequenceGenerator(name = "idUsuarioGenerador", sequenceName = "SEQ_USUARIO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idUsuarioGenerador")
    @Column(name = "ID_USUARIO", nullable = false)
    private int idUsuario;
    @Column(name = "NOMBRE", nullable = false)
    private String nombre;
    @Column(name = "APELLIDO", nullable = false)
    private String apellido;
    @Column(name = "CORREO", nullable = false)
    private String correo;
    @JoinColumn(name = "ID_TIPO_DOCUMENTO", nullable = true, referencedColumnName = "ID_TIPO_DOCUMENTO")
    @ManyToOne
    private TipoDocumentoEntity idTipoDocumento;
    @Column(name = "NUMERO_DOCUMENTO", nullable = true)
    private String numeroDocumento;
    @JoinColumn(name = "ID_TIPO_USUARIO", nullable = false, referencedColumnName = "ID_TIPO_USUARIO")
    @ManyToOne
    private TipoUsuarioEntity idTipoUsuario;
    @Column(name = "CELULAR", nullable = true)
    private String celular;
    @Column(name = "SESION", nullable = false)
    private Boolean sesion;
    @Column(name = "CONTRASE", nullable = false)
    private String contrase;
    @Column(name = "NOMUSUARIO", nullable = false)
    private String nomUsuario;

    public int getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getNumeroDocumento() {
        return numeroDocumento;
    }
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public Boolean getSesion() {
        return sesion;
    }
    public void setSesion(Boolean sesion) {
        this.sesion = sesion;
    }
    public TipoDocumentoEntity getIdTipoDocumento() {
        return idTipoDocumento;
    }
    public void setIdTipoDocumento(TipoDocumentoEntity idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }
    public TipoUsuarioEntity getIdTipoUsuario() {
        return idTipoUsuario;
    }
    public void setIdTipoUsuario(TipoUsuarioEntity idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }
    public String getContrase() {
        return contrase;
    }
    public void setContrase(String contrase) {
        this.contrase = contrase;
    }
    public String getNomUsuario() {
        return nomUsuario;
    }
    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }
    

}
