package com.example.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.project.module.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {
    // JPA provides CRUD methods automatically
}
