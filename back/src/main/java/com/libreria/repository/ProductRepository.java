package com.libreria.repository;

import com.libreria.entity.ProductosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductosEntity, Integer> {
    Optional<ProductosEntity> findByStrCodigoProducto(String strCodigoProducto);

}
