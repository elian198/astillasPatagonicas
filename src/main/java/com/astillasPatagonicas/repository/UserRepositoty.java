package com.astillasPatagonicas.repository;

import com.astillasPatagonicas.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoty  extends JpaRepository<User, Long> {
}