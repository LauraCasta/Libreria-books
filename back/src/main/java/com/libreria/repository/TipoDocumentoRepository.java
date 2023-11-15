package com.libreria.repository;

import com.libreria.entity.TipoDocumentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TipoDocumentoRepository extends JpaRepository<TipoDocumentoEntity, Integer> {
    Optional<TipoDocumentoEntity> findByIdTpDoc(int idTipoDoc);
}
