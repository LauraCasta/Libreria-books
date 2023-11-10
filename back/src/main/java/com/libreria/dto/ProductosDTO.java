package com.libreria.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductosDTO {
    private String strCodigoProducto;
    private String strNombreProducto;
    private int numCantidad;
    private int numValorUnidad;

    public String getStrCodigoProducto() {
        return strCodigoProducto;
    }

    public void setStrCodigoProducto(String strCodigoProducto) {
        this.strCodigoProducto = strCodigoProducto;
    }

    public String getStrNombreProducto() {
        return strNombreProducto;
    }

    public void setStrNombreProducto(String strNombreProducto) {
        this.strNombreProducto = strNombreProducto;
    }

    public int getNumCantidad() {
        return numCantidad;
    }

    public void setNumCantidad(int numCantidad) {
        this.numCantidad = numCantidad;
    }

    public int getNumValorUnidad() {
        return numValorUnidad;
    }

    public void setNumValorUnidad(int numValorUnidad) {
        this.numValorUnidad = numValorUnidad;
    }
}
