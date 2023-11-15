package com.libreria.repository;

import com.libreria.entity.CarritoEntity;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CarritoRepository extends JpaRepository<CarritoEntity, Integer> {
    CarritoEntity findByIdCarrito(int idCarrito);
}
