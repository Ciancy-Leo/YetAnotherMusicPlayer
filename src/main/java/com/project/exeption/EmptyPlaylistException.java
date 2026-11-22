package com.project.exeption;
//Risoluzione temporanea per le exception
public class EmptyPlaylistException extends Exception {
    public EmptyPlaylistException(String errorMessage){
        super(errorMessage);
    }
}