/*
 * @file: Testo.java
 * @about: Classe che rappresenta l'entità madre testo nel database
 */

package com.bruna.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

//Rappresenta la tabella testo nel db
@Entity
@Table(name = "testo")
public class Testo {
	
	//ENTITA' TABELLA
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 8000)
	private String contenuto;
	private int numeroFrasi;
	private int numeroParole;
	private int numerCaratteri;
	@Column(length = 4000)
	private String FrasePiuLunga;
	private String parolaPiuLunga;
	private String parolaPiuUsata;
	
	public int getNumerCaratteri() {
		return numerCaratteri;
	}

	public void setNumerCaratteri(int numerCaratteri) {
		this.numerCaratteri = numerCaratteri;
	}

	public String getParolaPiuUsata() {
		return parolaPiuUsata;
	}

	public void setParolaPiuUsata(String parolaPiuUsata) {
		this.parolaPiuUsata = parolaPiuUsata;
	}
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "testo")
	private List<Frase> frase = new ArrayList<Frase>();
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "testo")
	private List<Parola> parole = new ArrayList<Parola>();
	
	//GETTERS AND SETTERS
	
	public String getParolaPiuLunga() {
		return parolaPiuLunga;
	}

	public void setParolaPiuLunga(String parolaPiuLunga) {
		this.parolaPiuLunga = parolaPiuLunga;
	}

	public String getFrasePiuLunga() {
		return FrasePiuLunga;
	}

	public void setFrasePiuLunga(String frasePiùLunga) {
		FrasePiuLunga = frasePiùLunga;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getNumeroParole() {
		return numeroParole;
	}

	public void setNumeroParole(int numeroParole) {
		this.numeroParole = numeroParole;
	}

	public String getTxt() {
		return contenuto;
	}
	
	public void setTxt(String txt) {
		this.contenuto = txt;
	}

	public int getNumeroFrasi() {
		return numeroFrasi;
	}

	public void setNumeroFrasi(int numeroFrasi) {
		this.numeroFrasi = numeroFrasi;
	}

	public List<Frase> getFrase() {
		return frase;
	}

	public void setFrase(List<Frase> frase) {
		this.frase = frase;
	}	
	
	
	
}

