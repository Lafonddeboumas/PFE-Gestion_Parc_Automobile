package com.acsi.gpa.dto.marquedto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MarqueResponse {

    @Column(name = "designation")
    private String designation;
}
