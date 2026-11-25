package com.project.exeption;
//Risoluzione temporanea per le exception
public class BranoDoesNotExistsException extends Exception {
    public BranoDoesNotExistsException(String errorMessage){
        super(errorMessage);
    }
}