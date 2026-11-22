package com.project.service;

public interface LibreriaService{

    public void addArtista(Artista artista); 
    public void addAlbum(Album album); 
    public void addBrano(Brano brano); 
    public void removeArtista(Artista artista);
    public void removeAlbum(Album album); 
    public void removeBrano(Brano brano);
}