package com.project.service;

public interface StatisticheService{

    public void tempoTotaleAscolto();
    public void numeroAscolti();
    public List<Brano> topBrani(int n);
    public List<Artista> topArtisti(int n);
    public List<Brano> suggerimenti(int n);
}