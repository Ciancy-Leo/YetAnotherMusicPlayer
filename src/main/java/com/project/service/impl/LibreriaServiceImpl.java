package com.project.service.impl;

import java.io.FileWriter;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import java.io.IOException;
import java.util.*;
import com.project.service.LibreriaService;

public class LibreriaServiceImpl implements LibreriaService{


    public void addArtista(Artista artista) {
        // se fatto così da aggiungere all'interno del pom file le dipendenze per jackson
        ObjectMapper mapper = new ObjectMapper(); //da ricontrollare bene l'utilizzo di mapper e mapper.writeValueAsString
        try {
            String artistaJson = mapper.writeValueAsString(artista);
            //da verificare se c'è strettamente bisogno del secondo try-catch
            try (FileWriter writer = new FileWriter(jacksonArtisti, true)) { //temporaneamente creato 3 file diversi per scrittura e lettura, da verificare se conviene crearne solo uno e formattarlo decentemente
          	    writer.write(artistaJson);
		} 
      	catch (IOException e) {
		    }
        }
        catch(Exception ArtistaAlreadyExistsException) {

        }
    }
    public void addAlbum(Album album) {
        try {
            
        }
        catch(Exception AlbumAlreadyExistsException) {

        }
    }
    public void addBrano(Brano brano) {
        try {
            
        }
        catch(Exception BranoAlreadyExistsException) {

        }
        
        // inserire un brano, esattamente come rimuoverlo implica che lo devi inserire nelle cartelle /resources/CoverAlbum e /resources/Musica
    }
    public void removeArtista(Artista artista) {
        ObjectMapper mapper = new ObjectMapper();
        try { 
            // source:https://dzone.com/articles/how-can-we-read-a-json-file-in-java da ricontrollare
            String artistaJson = mapper.writeValueAsString(artista);
            Object o = new JSONParser().parse(new FileReader(jacksonArtisti.json));
            JSONObject j = (JSONObject) o;

            while(/* fino a esaurimento righe all'interno del file || oggetto trovato all'interno del file */) {
                if(/* riga json == j.nomeArte || riga json == j.listaArtisti? */) {
                    // rimuovi oggetto json dal file
                }

            }

        }
        catch(Exception ArtistaDoesNotExistsException) {

        }
    }
    public void removeAlbum(Album album) {
        try {
            
        }
        catch(Exception AlbumDoesNotExistsException) {

        }
    }
    public void removeBrano(Brano brano) {
        try {
            
        }
        catch(Exception BranoDoesNotExistsException) {

        }
        // rimozione del brano dalla libreria implica anche la rimozione all'interno di /resources/CoverAlbum e /resources/Musica dei file inereti al brano

    }
}