/*
 * @file: Frase.java
 * @about: Classe che rappresenta l'entità frase nel database
 * @FK: testo
 */

package com.bruna.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

//Rappresenta la tabella frase nel db
@Entity
@Table(name = "frase")
public class Frase {
	
	//ENTITA' TAB
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String contenuto;
	//Chiave esterna, punta a testoID   
	@ManyToOne
	@JsonIgnore
	private Testo testo;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String parolaPiuUsataPerFrase;
	private String parolaPiuLungaPerFrase;
	//GETTERS AND SETTERS

	public String getParolaPiuLungaPerFrase() {
		return parolaPiuLungaPerFrase;
	}

	public void setParolaPiuLungaPerFrase(String parolaPiuLungaPerFrase) {
		this.parolaPiuLungaPerFrase = parolaPiuLungaPerFrase;
	}

	public String getParolaPiuUsataPerFrase() {
		return parolaPiuUsataPerFrase;
	}

	public void setParolaPiuUsataPerFrase(String parolaPiuUsataPerFrase) {
		this.parolaPiuUsataPerFrase = parolaPiuUsataPerFrase;
	}

	public Testo getTesto() {
		return testo;
	}
	
	public void setTesto(Testo testo) {
		this.testo = testo;
	}
	
	public String getContenuto() {
		return contenuto;
	}

	public void setContenuto(String contenuto) {
		this.contenuto = contenuto;
	}
	
}