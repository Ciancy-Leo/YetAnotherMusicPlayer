package com.project.exeption;
//Risoluzione temporanea per le exception
public class BranoAlreadyExistsException extends Exception {
    public BranoAlreadyExistsException(String errorMessage){
        super(errorMessage);
    }
}