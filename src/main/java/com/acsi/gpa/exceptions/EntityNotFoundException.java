package com.acsi.gpa.exceptions;

import lombok.Getter;

public class EntityNotFoundException extends RuntimeException {
/*Cette exception seras levé lorsqu'on vas chercher quelque chose dans la base de données mais on ne la trouve pas
    tout en lui passant l'objet d'erreur*/
    @Getter
    private ErrorsCode errorsCode;

    public EntityNotFoundException(String message){
        super(message);
    }
    public EntityNotFoundException(String message, Throwable cause){
        super(message, cause);
    }
    public EntityNotFoundException(String message, Throwable cause, ErrorsCode errorsCode){
        super(message, cause);
        this.errorsCode = errorsCode;
    }
    public EntityNotFoundException(String message, ErrorsCode errorsCode){
        super(message);
        this.errorsCode = errorsCode;
    }
}
