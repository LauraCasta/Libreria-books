package com.libreria.entity;

import javax.persistence.*;

@Entity
@Table(name = "TIPO_LIBROS")
public class TipoLibroEntity {
    @Id
    @Column(name = "ID_TIPO_LIBRO", nullable = false)
    private int idTipoLibro;
    @Column(name = "TIPO_LIBRO", nullable = false)
    private String tipoLibro;
    
    public int getIdTipoLibro() {
        return idTipoLibro;
    }
    public void setIdTipoLibro(int idTipoLibro) {
        this.idTipoLibro = idTipoLibro;
    }
    public String getTipoLibro() {
        return tipoLibro;
    }
    public void setTipoLibro(String tipoLibro) {
        this.tipoLibro = tipoLibro;
    }

    
}
