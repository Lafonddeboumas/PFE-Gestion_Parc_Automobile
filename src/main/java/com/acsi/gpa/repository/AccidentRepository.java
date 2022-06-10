package com.acsi.gpa.repository;

import com.acsi.gpa.entities.Accident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccidentRepository extends JpaRepository<Accident,Long> {
    Optional<Accident> findAccidentByLieuAccident(String lieu);
}
