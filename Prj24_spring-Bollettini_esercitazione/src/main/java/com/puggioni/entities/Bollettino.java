package com.puggioni.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Bollettino")
public class Bollettino {
	@Id
	private String id;
	private double importo;
	private String causale;
	private String nomePagatore;
	private String numeroCartaCredito;

// relazione con la tabella ContoCorrente + foreign key id_conto
	@ManyToOne
    @JoinColumn(name = "conto_id")
    private ContoCorrente conto;

	
	
	// getters and setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getImporto() {
		return importo;
	}

	public void setImporto(double importo) {
		this.importo = importo;
	}

	public String getCausale() {
		return causale;
	}

	public void setCausale(String causale) {
		this.causale = causale;
	}

	public String getNomePagatore() {
		return nomePagatore;
	}

	public void setNomePagatore(String nomePagatore) {
		this.nomePagatore = nomePagatore;
	}

	public String getNumeroCartaCredito() {
		return numeroCartaCredito;
	}

	public void setNumeroCartaCredito(String numeroCartaCredito) {
		this.numeroCartaCredito = numeroCartaCredito;
	}

	public ContoCorrente getConto() {
		return conto;
	}

	public void setConto(ContoCorrente conto) {
		this.conto = conto;
	}

}



