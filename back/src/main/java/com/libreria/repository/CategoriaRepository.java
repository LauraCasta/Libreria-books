package com.libreria.repository;

import com.libreria.entity.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Integer> {
    Optional<CategoriaEntity> findByCategoriaLibro(String categoria);
}
