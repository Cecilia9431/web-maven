package com.example.model;
import java.util.List;

/*
 * Per ogni classe di entit� una interfaccia che espone le funzioni che
 * realizzano la persistenza
 */
public interface LibroDao {
	
	public abstract List<Libro> elencoLibri();
	

}
