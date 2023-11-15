package com.libreria.repository;

import com.libreria.entity.CarritoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarritoRepository extends JpaRepository<CarritoEntity, Integer> {
    Optional<CarritoEntity> findByIdCarrito(int idCarrito);

}
