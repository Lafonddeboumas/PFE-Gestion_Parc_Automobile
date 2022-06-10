package com.acsi.gpa.repository;

import com.acsi.gpa.entities.TypeFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeFournisseurRepository extends JpaRepository<TypeFournisseur,Long> {
}
