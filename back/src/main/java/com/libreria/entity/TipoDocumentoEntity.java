package com.libreria.entity;

import javax.persistence.*;

@Entity
@Table(name = "TIPO_DOCUMENTOS")
public class TipoDocumentoEntity {
    @Id
    @Column(name = "ID_TIPO_DOCUMENTO", nullable = false)
    private int idTipoDocumento;
    @Column(name = "TIPO_DOCUMENTO", nullable = false)
    private String tipoDocumento;
    @Column(name = "DESCRIPCION_DOCUMENTO", nullable= false)
    private String descripcionDocumento;
    
    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }
    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }
    public String getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public String getDescripcionDocumento() {
        return descripcionDocumento;
    }
    public void setDescripcionDocumento(String descripcionDocumento) {
        this.descripcionDocumento = descripcionDocumento;
    }
    
}