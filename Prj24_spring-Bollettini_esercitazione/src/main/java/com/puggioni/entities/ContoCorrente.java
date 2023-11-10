package com.puggioni.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="ContoCorrente")
public class ContoCorrente {
	
	@Id
	private int id;
	private String nomeIntestatario;
	

	
// relazione con la tabella Bollettino
	@OneToMany(mappedBy = "conto")
	private List<Bollettino>bollettini;


	// getters and setters
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNomeIntestatario() {
		return nomeIntestatario;
	}



	public void setNomeIntestatario(String nomeIntestatario) {
		this.nomeIntestatario = nomeIntestatario;
	}



	public List<Bollettino> getBollettini() {
		return bollettini;
	}



	public void setBollettini(List<Bollettino> bollettini) {
		this.bollettini = bollettini;
	}

}

