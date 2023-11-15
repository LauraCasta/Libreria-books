package com.libreria.entity;


import javax.persistence.*;

@Entity
@Table(name = "TIPO_USUARIOS")
public class TipoUsuarioEntity {
    @Id
    @Column(name = "ID_TIPO_USUARIO", nullable = false)
    private int idTipoUsuario;
    @Column(name = "TIPO_USUARIO", nullable = false)
    private String tipoUsuario;

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }
    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }
    public String getTipoUsuario() {
        return tipoUsuario;
    }
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    
}
