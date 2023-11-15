package com.libreria.entity;

import javax.persistence.*;

@Entity
@Table(name = "REGISTRO_VENTAS")
public class VentasEntity {
    @Id
    @SequenceGenerator(name = "idVentaGenerador", sequenceName = "SEQ_VENTA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idVentaGenerador")
    @Column(name = "ID_VENTA", nullable = false)
    private int idVenta;
    @JoinColumn(name = "ID_FACTURA", nullable = false, referencedColumnName="ID_FACTURA")
    @ManyToOne
    private FacturaEntity idFactura;
    @JoinColumn(name = "ID_USUARIO", nullable = false, referencedColumnName="ID_USUARIO")
    @ManyToOne
    private UsuarioEntity idUsuario;
    
    public int getIdVenta() {
        return idVenta;
    }
    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }
    public FacturaEntity getIdFactura() {
        return idFactura;
    }
    public void setIdFactura(FacturaEntity idFactura) {
        this.idFactura = idFactura;
    }
    public UsuarioEntity getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(UsuarioEntity idUsuario) {
        this.idUsuario = idUsuario;
    }


}