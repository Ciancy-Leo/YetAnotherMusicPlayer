package com.project.exeption;
//Risoluzione temporanea per le exception
public class AlbumAlreadyExistsException extends Exception {
    public AlbumAlreadyExistsException(String errorMessage){
        super(errorMessage);
    }
}