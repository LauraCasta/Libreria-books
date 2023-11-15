package com.libreria.entity;

import javax.persistence.*;

@Entity
@Table(name = "LIBROCARRITO")
public class LibroCarritoEntity {
    @Id
    @SequenceGenerator(name = "idItemGenerador", sequenceName = "SEQ_ITEM", allocationSize = 1 )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idItemGenerador")
    @Column(name = "ID_ITEM", nullable = false)
    private int idItem;
    @JoinColumn(name = "ID_LIBRO", nullable = false, referencedColumnName = "ID_LIBRO")
    @ManyToOne
    private LibrosEntity idLibro;
    @Column(name = "CANTIDAD", nullable = false)
    private int cantidad;
    @Column(name = "TOTAL", nullable = false)
    private int total;
    @JoinColumn(name = "ID_CARRITO", nullable = false, referencedColumnName = "ID_CARRITO")
    @ManyToOne
    private CarritoEntity idCarrito;

    public LibrosEntity getIdLibro() {
        return idLibro;
    }
    public void setIdLibro(LibrosEntity idLibro) {
        this.idLibro = idLibro;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getTotal() {
        return total;
    }
    public int getIdItem() {
        return idItem;
    }
    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public CarritoEntity getIdCarrito() {
        return idCarrito;
    }
    public void setIdCarrito(CarritoEntity idCarrito) {
        this.idCarrito = idCarrito;
    }
   

}
