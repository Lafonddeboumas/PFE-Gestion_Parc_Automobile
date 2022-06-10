package com.acsi.gpa.repository;

import com.acsi.gpa.entities.Panne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PanneRepository extends JpaRepository<Panne,Long> {
}
