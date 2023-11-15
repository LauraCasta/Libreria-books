package com.libreria.repository;

import com.libreria.entity.FacturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FacturaRepository extends JpaRepository<FacturaEntity, Integer> {
    Optional<FacturaEntity> findByIdFactura(int idFactura);
}
