package com.libreria.entity;


import javax.persistence.*;

@Entity
@Table(name = "CATEGORIA_LIBROS")
public class CategoriaEntity {
    @Id
    @Column(name = "ID_CATEGORIA", nullable = false)
    private int idCategoria;
    @Column(name = "CATEGORIA_LIBRO", nullable = false)
    private String categoriaLibro;
    
    public int getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    public String getCategoriaLibro() {
        return categoriaLibro;
    }
    public void setCategoriaLibro(String categoriaLibro) {
        this.categoriaLibro = categoriaLibro;
    }   

    
}
