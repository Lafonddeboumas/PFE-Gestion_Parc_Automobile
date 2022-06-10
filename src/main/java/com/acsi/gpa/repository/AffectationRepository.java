package com.acsi.gpa.repository;

import com.acsi.gpa.entities.Affectation;
import com.acsi.gpa.entities.ChauffeurMecanicien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;

@Repository
public interface AffectationRepository extends JpaRepository<Affectation,Long> {

    Optional<Affectation> findAffectationByDateAffectation(Date dateAffectation);

    Optional<Affectation> findAffectationByChauffeurMecanicienNom(ChauffeurMecanicien chauffeurMecanicien);
}
