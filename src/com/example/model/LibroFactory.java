package com.example.model;
/*
 * Una classe factory che restitruisce su riferimento ad interfaccia un'istanza della classe fisica che realizza la persistenza
 * Serve per disaccoppiare i client dalla implementazione 
 */
public class LibroFactory {
	
	public static LibroDao getInstance() {
		return new LibroDaoImpl();
	}

}