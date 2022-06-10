package com.acsi.gpa.repository;

import com.acsi.gpa.entities.PleinCarburant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PleinCarburantRepository extends JpaRepository<PleinCarburant,Long> {
}
