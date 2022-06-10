package com.acsi.gpa.repository;

import com.acsi.gpa.entities.TypeVehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeVehiculeRepository extends JpaRepository<TypeVehicule,Long> {
}
