package com.libreria.repository;

import com.libreria.entity.LibrosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LibrosRepository extends JpaRepository<LibrosEntity, Integer> {
    Optional<LibrosEntity> findByIdLibro(int idLibro);
    List<LibrosEntity>  findAllByIdCategoria(int idCategoria);
}
