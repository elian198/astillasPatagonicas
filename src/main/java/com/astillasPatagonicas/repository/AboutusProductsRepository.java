package com.astillasPatagonicas.repository;

import com.astillasPatagonicas.entities.AboutusProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutusProductsRepository extends JpaRepository<AboutusProducts, Long> {
}
