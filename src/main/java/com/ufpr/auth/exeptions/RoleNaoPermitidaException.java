package com.ufpr.auth.exeptions;

public class RoleNaoPermitidaException extends Exception{
    public RoleNaoPermitidaException(String mensagem){
        super(mensagem);
    }
}