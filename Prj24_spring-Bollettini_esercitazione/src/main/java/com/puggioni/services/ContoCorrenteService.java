package com.puggioni.services;

import com.puggioni.entities.ContoCorrente;
import com.puggioni.repos.ContoCorrenteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContoCorrenteService {
    private final ContoCorrenteDAO contoCorrenteDAO;

    @Autowired
    public ContoCorrenteService(ContoCorrenteDAO contoCorrenteDAO) {
    // Inizializza l'oggetto ContoCorrenteDAO utilizzando l'iniezione delle dipendenze
        this.contoCorrenteDAO = contoCorrenteDAO; 
    }

    /**
     * Verifica se un conto corrente è abilitato dato un determinato ID.
     *
     * @param id l'ID del conto corrente da verificare
     * @return true se il conto corrente è abilitato, false altrimenti
     */
    public boolean isContoAbilitatoById(int id) {
    // Recupera l'oggetto ContoCorrente dal ContoCorrenteDAO utilizzando l'ID
        ContoCorrente contoCorrente = contoCorrenteDAO.findById(id).orElse(null); 
        
     // Restituisce true se l'oggetto ContoCorrente è stato trovato, altrimenti restituisce false
        return contoCorrente != null; 
    }

    /**
     * Ottiene un oggetto ContoCorrente dato un determinato ID.
     *
     * @param id l'ID del conto corrente da ottenere
     * @return l'oggetto ContoCorrente corrispondente all'ID fornito, o null se non trovato
     */
    public ContoCorrente getContoCorrenteById(int id) {
    	// Recupera l'oggetto ContoCorrente dal repository ContoCorrenteDAO utilizzando l'ID fornito, restituisce null se non trovato
        return contoCorrenteDAO.findById(id).orElse(null); 
    }
}
