package com.libreria.repository;

import com.libreria.entity.LibroCarritoEntity;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LibroCarritoRepository extends JpaRepository<LibroCarritoEntity, Integer> {
    Optional<LibroCarritoEntity> findByIdItem(int idItem);
}
