package com.acsi.gpa.repository;

import com.acsi.gpa.entities.Entretien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntretienRepository  extends JpaRepository<Entretien,Long> {
}
