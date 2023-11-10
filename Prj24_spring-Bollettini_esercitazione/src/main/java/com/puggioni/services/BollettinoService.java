package com.puggioni.services;

import com.puggioni.entities.Bollettino;
import com.puggioni.entities.ContoCorrente;
import com.puggioni.repos.BollettinoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BollettinoService {
    private final BollettinoDAO bollettinoDAO;
    private final ContoCorrenteService contoCorrenteService;

    @Autowired
    public BollettinoService(BollettinoDAO bollettinoDAO, ContoCorrenteService contoCorrenteService) {
   // Inizializzazione dell'oggetto BollettinoDAO e dell'oggetto ContoCorrenteService utilizzando l'iniezione delle dipendenze
        this.bollettinoDAO = bollettinoDAO; 
        this.contoCorrenteService = contoCorrenteService; 
    }

    /**
     * Verifica se un conto corrente è abilitato dato un determinato ID.
     *
     * @param id l'ID del conto corrente da verificare
     * @return true se il conto corrente è abilitato, false altrimenti
     */
    public boolean isContoAbilitato(int id) {
        return contoCorrenteService.isContoAbilitatoById(id); // Richiama il metodo isContoAbilitatoById del servizio ContoCorrenteService per verificare l'abilitazione del conto corrente
    }

    /**
     * Ottiene un oggetto ContoCorrente dato un ID.
     *
     * @param id l'ID del conto corrente da ottenere
     * @return l'oggetto ContoCorrente corrispondente all'ID fornito
     */
    public ContoCorrente getContoCorrente(int id) {
        return contoCorrenteService.getContoCorrenteById(id); // Richiama il metodo getContoCorrenteById del servizio ContoCorrenteService per ottenere l'oggetto ContoCorrente corrispondente all'ID fornito
    }

    /**
     * Registra un pagamento Bollettino nel database.
     *
     * @param bollettino l'oggetto Bollettino da registrare
     */
    public void registraPagamento(Bollettino bollettino) {
        bollettinoDAO.save(bollettino); // Salva l'oggetto Bollettino utilizzando il repository BollettinoDAO per registrarne il pagamento nel database
    }
}
