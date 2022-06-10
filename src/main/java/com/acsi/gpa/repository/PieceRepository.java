package com.acsi.gpa.repository;

import com.acsi.gpa.entities.Piece;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PieceRepository extends JpaRepository<Piece,Long> {
}
