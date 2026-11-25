package com.project.service;

public interface PlaylistService{

    //forse string per stampare il risultato riuscito/fallito per quasi tutti i metodi presenti in questa classe

    public void createPlaylist(String nome);
    public void modifyPlaylistName(String nome, Playlist playlist);
    public void deletePlaylist(Playlist playlist);
    public void addBranoPlaylist(Brano brano, Playlist playlist);
    public void deleteBranoPlaylist(Brano brano, Playlist playlist);
    public void branoUp(Brano brano);
    public void branoDown(Brano brano);
}