package com.project.exeption;
//Risoluzione temporanea per le exception
public class BranoNotFoundException extends Exception {
    public BranoNotFoundException(String errorMessage){
        super(errorMessage);
    }
}