package com.acsi.gpa.dto.directiondto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DirectionResponse {

    private String nomDirection;

    private BigDecimal nombreVehicule;
}
