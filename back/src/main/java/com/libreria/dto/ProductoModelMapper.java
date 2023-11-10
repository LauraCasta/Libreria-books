package com.libreria.dto;

import java.util.List;

import org.modelmapper.ModelMapper;

import com.libreria.entity.ProductosEntity;

public class ProductoModelMapper {
    private final ModelMapper MAPPER = new ModelMapper();
    private static ProductoModelMapper instance;
    private ProductoModelMapper(){    }
    public static ProductoModelMapper singleInstance(){
        if(instance == null){
            instance = new ProductoModelMapper();
        }
        return instance;
    }

    public ProductosEntity mapProductoEntity(List<ProductosDTO> productoDto){
        return MAPPER.map(productoDto, ProductosEntity.class);
    }

    public ProductosDTO mapProductoDto(ProductosEntity producto){
        return MAPPER.map(producto,ProductosDTO.class);
    }

}
