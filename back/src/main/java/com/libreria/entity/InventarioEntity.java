package com.libreria.entity;
import javax.persistence.*;

@Entity
@Table(name = "INVENTARIO_LIBROS")
public class InventarioEntity {
    @Id
    @SequenceGenerator(name = "idInventarioGenerador", sequenceName = "SEQ_INVENTARIO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idInventarioGenerador")
    @Column(name = "ID_INVENTARIO", nullable = false)
    private int idInventario;
    @JoinColumn(name = "ID_LIBRO", nullable = false, referencedColumnName="ID_LIBRO")
    @ManyToOne
    private LibrosEntity idLibro;
    @Column(name = "CANTIDAD_DISPONIBLE", nullable=false)
    private int cantidadDisponible;
    @Column(name = "VALOR_UNIDAD", nullable = false)
    private int valorUnidad;
    public int getIdInventario() {
        return idInventario;
    }
    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }
    public LibrosEntity getIdLibro() {
        return idLibro;
    }
    public void setIdLibro(LibrosEntity idLibro) {
        this.idLibro = idLibro;
    }
    public int getCantidadDisponible() {
        return cantidadDisponible;
    }
    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    public int getValorUnidad() {
        return valorUnidad;
    }
    public void setValorUnidad(int valorUnidad) {
        this.valorUnidad = valorUnidad;
    }

    
}
