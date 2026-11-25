package com.project.exeption;
//Risoluzione temporanea per le exception
public class ArtistaDoesNotExistsException extends Exception {
    public ArtistaDoesNotExistsException(String errorMessage){
        super(errorMessage);
    }
}