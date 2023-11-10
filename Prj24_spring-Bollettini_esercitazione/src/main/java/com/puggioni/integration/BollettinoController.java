package com.puggioni.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.puggioni.entities.Bollettino;
import com.puggioni.entities.ContoCorrente;
import com.puggioni.services.BollettinoService;

@Controller
public class BollettinoController {
    private final BollettinoService bollettinoService;

    @Autowired
    public BollettinoController(BollettinoService bollettinoService) {
        this.bollettinoService = bollettinoService; // Inizializza l'oggetto BollettinoService utilizzando l'iniezione delle dipendenze
    }

    @GetMapping("/index")
    public String showIndexPage() {
        return "index"; // Restituisce la vista "index"
    }

    @PostMapping("/pagamento")
    public String handlePagamento(@RequestParam("idConto") int id,
                                  @RequestParam("codiceBollettino") String idBollettino,
                                  @RequestParam("causale") String causale,
                                  @RequestParam("importo") double importo,
                                  @RequestParam("nomePagatore") String nomePagatore,
                                  @RequestParam("numeroCartaCredito") String numeroCartaCredito,
                                  Model model) {
        // Verifica se il conto corrente è abilitato
        boolean isContoAbilitato = bollettinoService.isContoAbilitato(id);
        if (!isContoAbilitato) { // provare try catch
        // Se il conto corrente non è abilitato, reindirizza alla vista "errore"
            return "errore"; 
        }

        // Ottieni il conto corrente
        ContoCorrente contoCorrente = bollettinoService.getContoCorrente(id);
        if (contoCorrente == null || contoCorrente.getId() != id) {
        // Se il conto corrente non è valido, reindirizza alla vista "errore"
            return "errore"; 
        }

        // Crea il bollettino e registra il pagamento
        Bollettino bollettino = new Bollettino();
        bollettino.setId(idBollettino);
        bollettino.setCausale(causale);
        bollettino.setImporto(importo);
        bollettino.setConto(contoCorrente);
        bollettino.setNomePagatore(nomePagatore);
        bollettino.setNumeroCartaCredito(numeroCartaCredito);

        bollettinoService.registraPagamento(bollettino);

     // Aggiunge l'oggetto Bollettino all'attributo "bollettino" del modello
        model.addAttribute("bollettino", bollettino); 

     // Restituisce la vista "conferma"
        return "conferma"; // implementare statuscode.
    }

    @GetMapping("/errore")
    public String showErrorPage() {
    	// Restituisce la vista "errore"
        return "errore"; 
    }

    @GetMapping("/conferma")
    public String showConfermaPage() {
    	// Restituisce la vista "conferma"
        return "conferma"; 
    }
    
    @GetMapping("/uscita")
    public String showUscitaPage() {
    	return "uscita";
    }
}
