package com.example.model;
import java.util.List;

public class LibroService {
	
	private LibroDao dao = LibroFactory.getInstance();
	
	public List<Libro> ottieni() {
		return  dao.elencoLibri();
	}
	
}