package com.acsi.gpa.repository;

import com.acsi.gpa.entities.ChauffeurMecanicien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChauffeurMecanicienRepository extends JpaRepository<ChauffeurMecanicien,Long> {
}
