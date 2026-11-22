package com.project;

import java.time.LocalDate;
import java.util.List;

public class playlist{
    List<Brano> listaBrani;
    String nome;
    String descrizione;
    LocalDate dataCreazione;
    Utente utente;

    public void aggiungiBrano(Brano brano){}
    public void rimuoviBrano(Brano brano){}
    public void moveBrano(int index){}
    public int getDurataTotale(){}
}