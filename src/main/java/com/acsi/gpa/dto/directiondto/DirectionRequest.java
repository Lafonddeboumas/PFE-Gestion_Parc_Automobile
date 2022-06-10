package com.acsi.gpa.dto.directiondto;

import com.acsi.gpa.entities.Servces;
import com.acsi.gpa.entities.Vehicule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DirectionRequest {

    private String nomDirection;

    private BigDecimal nombreVehicule;

}
