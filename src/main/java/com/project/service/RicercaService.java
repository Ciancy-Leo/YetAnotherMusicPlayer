package com.project.service;

public interface RicercaService {

    public List<Brano> cercaBrano(String testo);
    public List<Artista> cercaArtisti(String testo);
    public List<Album> cercaAlbum(String testo);
    //da implementare criterio di filtro
}