package com.acsi.gpa.repository;

import com.acsi.gpa.entities.Reparation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReparationRepository  extends JpaRepository<Reparation,Long> {
}
