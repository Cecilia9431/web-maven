package com.example.model;
import java.util.ArrayList;
import java.util.List;


public class LibroDaoImpl  implements LibroDao{

	@Override
	public List<Libro> elencoLibri() {
		List<Libro> libri = new ArrayList<>();	
		libri.add( new Libro("corso adecco", "angelo", 30, 100) );
		libri.add( new Libro("corso accenture", "capone", 30, 100) );		
		return libri;
	}

}