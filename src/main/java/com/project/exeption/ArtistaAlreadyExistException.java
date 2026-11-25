package com.project.exeption;
//Risoluzione temporanea per le exception
public class ArtistaAlreadyExistsException extends Exception {
    public ArtistaAlreadyExistsException(String errorMessage){
        super(errorMessage);
    }
}