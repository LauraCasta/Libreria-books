package com.libreria.repository;

import com.libreria.entity.TipoLibroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TipoLibroRepository extends JpaRepository<TipoLibroEntity, Integer> {
    Optional<TipoLibroEntity> findByIdTipoLibro(int idTpLibro);
}
