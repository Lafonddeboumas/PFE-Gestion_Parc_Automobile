package com.acsi.gpa.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "service")
public class Servces {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_id")
    private Long idService;

    @Column(name = "nom")
    private String nomService;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "direction_id")
    private Direction direction;
}
