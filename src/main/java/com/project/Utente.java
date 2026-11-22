package com.project;

import java.time.LocalDate;
import java.util.List;

public class Utente{
    String nome;
    String cognome;
    String email;
    LocalDate dataNascita;
    List<Playlist> playlist;
    //da mettere enumSet preferenze

    public void aggiungiPlaylist(Playlist playlist){}
    public rimuoviPlaylist(Playlist playlist){}
}