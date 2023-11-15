package com.libreria.repository;

import com.libreria.entity.DetalleFacturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DetalleFacturaRepository extends JpaRepository<DetalleFacturaEntity, Integer> {
    Optional<DetalleFacturaEntity> findByIdDetalle(int idDetalle);
}
