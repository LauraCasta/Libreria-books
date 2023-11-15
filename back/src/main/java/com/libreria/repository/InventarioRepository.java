package com.libreria.repository;

import com.libreria.entity.InventarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InventarioRepository extends JpaRepository<InventarioEntity, Integer> {
    Optional<InventarioEntity> findByIdInventario(int idInventario);
}
