package com.acsi.gpa.repository;

import com.acsi.gpa.entities.DemandeVehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemandeVehiculeRepository extends JpaRepository<DemandeVehicule,Long> {
}
