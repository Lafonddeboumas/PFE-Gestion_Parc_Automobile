package com.acsi.gpa.repository;

import com.acsi.gpa.entities.EtatVehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatVehiculeRepository extends JpaRepository<EtatVehicule,Long> {
}
