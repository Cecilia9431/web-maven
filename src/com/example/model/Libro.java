package com.example.model;
public class Libro {
	
	private int id;
	private String titolo;
	private String autore;
	private double prezzo;
	private int nump;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getNump() {
		return nump;
	}
	public void setNump(int nump) {
		this.nump = nump;
	}
	public Libro(int id, String titolo, String autore, double prezzo, int nump) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.autore = autore;
		this.prezzo = prezzo;
		this.nump = nump;
	}
	public Libro(String titolo, String autore, double prezzo, int nump) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.prezzo = prezzo;
		this.nump = nump;
	}
	public Libro() {
		super();
	}
	
	

}