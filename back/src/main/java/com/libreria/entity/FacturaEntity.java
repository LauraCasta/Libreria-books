package com.libreria.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "FACTURA")
public class FacturaEntity {
    @Id
    @SequenceGenerator(name = "idFacturaGenerador", sequenceName = "SEQ_FACTURA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idFacturaGenerador")
    @Column(name = "ID_FACTURA", nullable = false)
    private int idFactura;
    @Column(name="FECHA_COMPRA", nullable = false)
    private Date fechaCompra;
    @Column(name="NUMERO_FACTURA", nullable = false)
    private String numeroFactura;
    @Column(name = "TOTAL_COMPRA", nullable = false)
    private int totalCompra;    
    @JoinColumn(name = "ID_MEDIO_PAGO", nullable = false, referencedColumnName="ID_MEDIO_PAGO")
    @ManyToOne
    private MedioPagoEntity idMedioPago;
    @Column(name = "DIRECCION_ENTREGA", nullable = false)
    private String direccion;
    @JoinColumn(name = "ID_USUARIO", nullable = false, referencedColumnName="ID_USUARIO")
    @ManyToOne
    private UsuarioEntity idUsuario;
    
    
    public int getIdFactura() {
        return idFactura;
    }
    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }
    public Date getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public String getNumeroFactura() {
        return numeroFactura;
    }
    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }
    public int getTotalCompra() {
        return totalCompra;
    }
    public void setTotalCompra(int totalCompra) {
        this.totalCompra = totalCompra;
    }
    public MedioPagoEntity getIdMedioPago() {
        return idMedioPago;
    }
    public void setIdMedioPago(MedioPagoEntity idMedioPago) {
        this.idMedioPago = idMedioPago;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public UsuarioEntity getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(UsuarioEntity idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
}
