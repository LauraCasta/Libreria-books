package com.libreria.repository;

import com.libreria.entity.MedioPagoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MedioPagoRepository extends JpaRepository<MedioPagoEntity, Integer> {
    Optional<MedioPagoEntity> findByIdPago(int idPago);
}
