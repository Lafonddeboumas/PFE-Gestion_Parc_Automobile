package com.acsi.gpa.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Utilisateur_id")
    private Long id_Utilisateur;

    @Column(name = "nomutilisateur")
    private String username;

    @Column(name = "Adresse")
    private String adresse;

    @Column(name = "email")
    private String email;

    //@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(name = "mot_de_passe")
    private String password;

    @Column(name = "Photo")
    private String photo;

    private boolean isactive;

    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Roles> roles = new ArrayList<>();
}
