package com.acsi.gpa.repository;

import com.acsi.gpa.entities.Taxe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxeRepository extends JpaRepository<Taxe,Long> {
}
