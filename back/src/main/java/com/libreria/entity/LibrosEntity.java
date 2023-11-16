package com.libreria.entity;
import javax.persistence.*;

@Entity
@Table(name = "LIBROS")
public class LibrosEntity {
    @Id
    @SequenceGenerator(name = "idLibroGenerador", sequenceName = "SEQ_LIBRO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idLibroGenerador")
    @Column(name = "ID_LIBRO", nullable = false)
    private int idLibro;
    @Column(name = "NOMBRE_LIBRO", nullable = false)
    private String nombreLibro;
    @JoinColumn(name = "ID_TIPO_LIBRO", nullable = false, referencedColumnName="ID_TIPO_LIBRO")
    @ManyToOne
    private TipoLibroEntity idTipoLibro;
    @JoinColumn(name = "ID_CATEGORIA", nullable = false, referencedColumnName="ID_CATEGORIA")
    @ManyToOne
    private CategoriaEntity idCategoria;
    @Column(name = "AUTOR", nullable = false)
    private String autor;
    @Column(name = "NUMERO_PAGINAS", nullable = false)
    private String numeroPagina;
    @Column(name = "EDITORIAL", nullable = false)
    private String editorial;
    @Column(name = "DESCRIPCION", nullable = false)
    private String descripcion;
    @Column(name = "FECHA_PUBLICACION", nullable = false)
    private String fechaPublicacion;
    @Column(name = "IDIOMA", nullable = false)
    private String idioma;
    @Column(name = "IMAGEN", nullable = false)
    private String imagen;
    @Column(name = "VALOR_UNIDAD", nullable = false)
    private int valorUnidad;
    


    public int getIdLibro() {
        return idLibro;
    }
    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }
    public String getNombreLibro() {
        return nombreLibro;
    }
    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }
    public TipoLibroEntity getIdTipoLibro() {
        return idTipoLibro;
    }
    public void setIdTipoLibro(TipoLibroEntity idTipoLibro) {
        this.idTipoLibro = idTipoLibro;
    }
    public CategoriaEntity getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(CategoriaEntity idCategoria) {
        this.idCategoria = idCategoria;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getNumeroPagina() {
        return numeroPagina;
    }
    public void setNumeroPagina(String numeroPagina) {
        this.numeroPagina = numeroPagina;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    public String getIdioma() {
        return idioma;
    }
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public int getValorUnidad() {
        return valorUnidad;
    }
    public void setValorUnidad(int valorUnidad) {
        this.valorUnidad = valorUnidad;
    }
}
