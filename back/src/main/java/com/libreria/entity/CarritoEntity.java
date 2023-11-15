package com.libreria.entity;

import javax.persistence.*;

@Entity
@Table(name = "CARRITO")
public class CarritoEntity {

    @Id
    @SequenceGenerator(name = "idCarritoGenerador", sequenceName = "SEQ_CARRITO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idCarritoGenerador")
    @Column(name = "ID_CARRITO", nullable = false)
    private int IdCarrito;
    @JoinColumn(name = "ID_LIBRO1", nullable = false, referencedColumnName = "ID_LIBRO")
    @ManyToOne
    private LibrosEntity idLibro1;
    @Column(name = "CANTIDAD1", nullable = false)
    private int cantidad1;
    @Column(name = "TOTAL1", nullable = false)
    private int total1;
    @JoinColumn(name = "ID_LIBRO2", nullable = false, referencedColumnName = "ID_LIBRO")
    @ManyToOne
    private LibrosEntity idLibro2;
    @Column(name = "CANTIDAD2", nullable = false)
    private int cantidad2;
    @Column(name = "TOTAL2", nullable = false)
    private int total2;
    @JoinColumn(name = "ID_LIBRO3", nullable = false, referencedColumnName = "ID_LIBRO")
    @ManyToOne
    private LibrosEntity idLibro3;
    @Column(name = "CANTIDAD3", nullable = false)
    private int cantidad3;
    @Column(name = "TOTAL3", nullable = false)
    private int total3;
    
    public LibrosEntity getIdLibro1() {
        return idLibro1;
    }
    public void setIdLibro1(LibrosEntity idLibro1) {
        this.idLibro1 = idLibro1;
    }
    public int getCantidad1() {
        return cantidad1;
    }
    public void setCantidad1(int cantidad1) {
        this.cantidad1 = cantidad1;
    }
    public int getTotal1() {
        return total1;
    }
    public void setTotal1(int total1) {
        this.total1 = total1;
    }
    public LibrosEntity getIdLibro2() {
        return idLibro2;
    }
    public void setIdLibro2(LibrosEntity idLibro2) {
        this.idLibro2 = idLibro2;
    }
    public int getCantidad2() {
        return cantidad2;
    }
    public void setCantidad2(int cantidad2) {
        this.cantidad2 = cantidad2;
    }
    public int getTotal2() {
        return total2;
    }
    public void setTotal2(int total2) {
        this.total2 = total2;
    }
    public LibrosEntity getIdLibro3() {
        return idLibro3;
    }
    public void setIdLibro3(LibrosEntity idLibro3) {
        this.idLibro3 = idLibro3;
    }
    public int getCantidad3() {
        return cantidad3;
    }
    public void setCantidad3(int cantidad3) {
        this.cantidad3 = cantidad3;
    }
    public int getTotal3() {
        return total3;
    }
    public void setTotal3(int total3) {
        this.total3 = total3;
    }
    public int getIdCarrito() {
        return IdCarrito;
    }
    public void setIdCarrito(int idCarrito) {
        IdCarrito = idCarrito;
    }
    

}
