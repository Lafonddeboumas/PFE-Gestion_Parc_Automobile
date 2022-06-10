package com.acsi.gpa.dto.utilisateurdto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UtilisateurResponse {

    private String username;

    private String adresse;

    private String email;

    //@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private String photo;

    private boolean isactive;

}
