package com.acsi.gpa.handlers;

import com.acsi.gpa.exceptions.ErrorsCode;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorDto {

    private Integer httpCode;

    private ErrorsCode code;

    private String message;

    private List<String> errors = new ArrayList<>();
}
