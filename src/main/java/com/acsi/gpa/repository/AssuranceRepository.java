package com.acsi.gpa.repository;

import com.acsi.gpa.entities.Assurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;

@Repository
public interface AssuranceRepository extends JpaRepository<Assurance,Long> {
    Optional<Assurance> findAssuranceByDateDebut(Date dateAssurance);
}
