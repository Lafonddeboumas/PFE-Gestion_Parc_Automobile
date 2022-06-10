package com.acsi.gpa.dto.utilisateurdto;

import com.acsi.gpa.entities.Roles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UtilisateurRequest {

    private String username;

    private String adresse;

    private String email;

    //@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private String photo;

    private boolean isactive;

    private Collection<Roles> roles = new ArrayList<>();
}
