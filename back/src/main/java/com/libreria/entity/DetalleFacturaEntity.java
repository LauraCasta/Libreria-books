package com.libreria.entity;

import javax.persistence.*;

@Entity
@Table(name = "DETALLE_FACTURA")
public class DetalleFacturaEntity {
    @Id
    @SequenceGenerator(name = "idDetalleGenerador", sequenceName = "SEQ_DETALLE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idDetalleGenerador")
    @Column(name = "ID_DETALLE", nullable = false)
    private int idDetalle;
    @JoinColumn(name = "ID_FACTURA", nullable = false, referencedColumnName="ID_FACTURA")
    @ManyToOne
    private FacturaEntity idFactura;
    @JoinColumn(name = "ID_CARRITO", nullable = false, referencedColumnName="ID_CARRITO")
    @ManyToOne
    private CarritoEntity idCarrito;
    
    public int getIdDetalle() {
        return idDetalle;
    }
    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }
    public FacturaEntity getIdFactura() {
        return idFactura;
    }
    public void setIdFactura(FacturaEntity idFactura) {
        this.idFactura = idFactura;
    }
    public CarritoEntity getIdCarrito() {
        return idCarrito;
    }
    public void setIdCarrito(CarritoEntity idCarrito) {
        this.idCarrito = idCarrito;
    }

    
    
}
