package com.astillasPatagonicas.repository;

import com.astillasPatagonicas.entities.Aboutus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutusRepository extends JpaRepository<Aboutus, Long> {
}
