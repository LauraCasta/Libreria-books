package com.libreria.entity;

import javax.persistence.*;

@Entity
@Table(name = "TBL_PRODUCTOS")
public class ProductosEntity {

    @Id
    @SequenceGenerator(name = "idProductoGenerador", sequenceName = "SEQ_PRODUCTO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idProductoGenerador")
    @Column(name = "NUM_ID_PRODUCTO", nullable = false)
    private int numIdProducto;
    @Column(name = "STR_CODIGO_PRODUCTO", nullable = false, unique = true,length = 3)
    private String strCodigoProducto;
    @Column(name = "STR_NOMBRE_PRODUCTO", nullable = false)
    private String strNombreProducto;
    @Column(name = "NUM_CANTIDAD", nullable = false)
    private int numCantidad;
    @Column(name = "NUM_VALOR_UNIDAD", nullable = false)
    private int numValorUnidad;

    public int getNumIdProducto() {
        return numIdProducto;
    }

    public void setNumIdProducto(int numIdProducto) {
        this.numIdProducto = numIdProducto;
    }

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
