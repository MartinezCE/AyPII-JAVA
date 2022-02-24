package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Conjuntos {

	Set <String> s;

// recorre de manera ordenada, orden natural 
	public void conjuntosConTreeSet() {
		this.s = new TreeSet<String>();
		llenarConjunto();
		printCollection(s);
	}
// no tiene encuenta el orden
	public void conjuntoConHashSet() {
		this.s = new HashSet<String>();
		llenarConjunto();
		printCollection(s);
	}

	public void llenarConjunto() {
		s.add("StarWras");
		s.add("El Padrino");
		s.add("Efecto Mariposa");
		s.add("La ventana indiscreta");
		s.add("The Birds");
		s.add("Vertigo");
		s.add("Psicosis");
		s.add("El senor de los anillos");
		s.add("Batman");
		s.add("Piratas del caribe");

	}


	public void printCollection(Set<String> s) {

		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			String pelicula = it.next();
			System.out.println(pelicula);
		}
	}


public static void main (String [] args) {

	Conjuntos conjunto = new Conjuntos ();
	
	conjunto.conjuntosConTreeSet();
	System.out.println("---------------------------");
	conjunto.conjuntoConHashSet();
}

}