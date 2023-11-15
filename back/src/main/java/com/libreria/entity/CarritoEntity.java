package com.libreria.entity;

import javax.persistence.*;

@Entity
@Table(name = "CARRITO")
public class CarritoEntity {
    @Id
    @SequenceGenerator(name = "idCarritoGenerador", sequenceName = "SEQ_CARRITO", allocationSize = 1 )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idCarritoGenerador")
    @Column(name = "ID_CARRITO", nullable = false)
    private int idCarrito;
    @Column(name = "TOTAL", nullable = false)
    private int total;
    
    public int getTotal() {
        return total;
    }
    public int getIdCarrito() {
        return idCarrito;
    }
    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    

}
