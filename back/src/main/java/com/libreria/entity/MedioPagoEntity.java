package com.libreria.entity;

import javax.persistence.*;

@Entity
@Table(name = "MEDIO_PAGOS")
public class MedioPagoEntity {
    @Id
    @Column(name = "ID_MEDIO_PAGO", nullable = false)
    private int idMedioPago;
    @Column(name = "MEDIO_PAGO", nullable = false)
    private String medioPago;
    
    public int getIdMedioPago() {
        return idMedioPago;
    }
    public void setIdMedioPago(int idMedioPago) {
        this.idMedioPago = idMedioPago;
    }
    public String getMedioPago() {
        return medioPago;
    }
    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }
    
    
}
