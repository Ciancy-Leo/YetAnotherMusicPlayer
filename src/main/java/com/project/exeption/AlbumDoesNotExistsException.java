package com.project.exeption;
//Risoluzione temporanea per le exception
public class AlbumDoesNotExistsException extends Exception {
    public AlbumDoesNotExistsException(String errorMessage){
        super(errorMessage);
    }
}