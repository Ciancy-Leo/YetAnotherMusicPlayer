package com.project.service;

public interface PlaylistService{

    public void createPlaylist(String nome); //forse string per stampare il risultato riuscito/fallito
    public void modifyPlaylistName(String nome, Playlist playlist); //forse string per stampare il risultato riuscito/fallito
    public void deletePlaylist(Playlist playlist); //forse string per stampare il risultato riuscito/fallito
    public void addBranoPlaylist(Brano brano, Playlist playlist); //forse string per stampare il risultato riuscito/fallito
    public void deleteBranoPlaylist(Brano brano, Playlist playlist); //forse string per stampare il risultato riuscito/fallito
    public void branoUp(Brano brano); //forse string per stampare il risultato riuscito/fallito
    public void branoDown(Brano brano); //forse string per stampare il risultato riuscito/fallito
}