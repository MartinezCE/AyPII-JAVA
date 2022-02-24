package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// las listas son una secuencia y se pueden recorrer como uno quiera

public class Cinefilo {


	public int calcularDuracionTotal (List<Pelicula> peliculas) {

		int duracionTotal = 0;

		//iterator es una nueva interface, representa el estado de recorrido de una lista

		Iterator <Pelicula> iterador = peliculas.iterator();


		// hasnext devuelve un booleano de si tengo un siguiente
		while(iterador.hasNext()) {

			// entonces dame el siguiente
			Pelicula unaPelicula = iterador.next();

			duracionTotal += unaPelicula.getDuracion();

		}

		return duracionTotal;

	}	


	public int contarLAsDelGenero (List<Pelicula>peliculas, Genero generoElegido) {

		int cuenta = 0;

		// para cada una de las unapelicula que saque de peliculas, osea
		// voy a iterar todos los elementos que estan dentros de peliculas
		// y voy a daclarar para cada uno de ellos la variable unaPelicula

		for(Pelicula unaPelicula : peliculas) {

			if(unaPelicula.getGenero() == generoElegido) {

				cuenta++;
			}
		}
		return cuenta;
	}


	public Pelicula buscarLaPrimeraDelGenero (List<Pelicula> peliculas, Genero generoElegido) {

		Pelicula peliculaEncontrada = null;

		Iterator<Pelicula> iterador = peliculas.iterator(); // Se utiliza para iterar de  un sentido progresivo y deja remover

		while((iterador.hasNext()) && (peliculaEncontrada == null)) {

			Pelicula unaPelicula = iterador.next();


			if( unaPelicula.getGenero() == generoElegido) {

				peliculaEncontrada = unaPelicula;	

			}
		}return peliculaEncontrada;
	} 


	public void filtrarCortrometrajes(List<Pelicula> peliculas) {


		Iterator <Pelicula> iterador = peliculas.iterator();

		while (iterador.hasNext()) {
			Pelicula unaPelicula = iterador.next();
			if(unaPelicula.getDuracion() >30) {

				// este metodo borra, remueve de la lista 
				iterador.remove();
			}
		}

	}

	// como buscar de atras hacia delante

	public Pelicula buscarLaUltimaDelGenero (List<Pelicula>peliculas, Genero generoElegido) {

		Pelicula peliculaEncontrada = null;

		ListIterator<Pelicula> iterador = peliculas.listIterator(peliculas.size());
		// recorre desde cualquier lugar, hacia delante o hacia tras

		while((iterador.hasPrevious()) && (peliculaEncontrada == null)) {

			Pelicula unaPelicula = iterador.previous();
			if(unaPelicula.getGenero() == generoElegido) {
				peliculaEncontrada = unaPelicula;
			}
		}
		return peliculaEncontrada;
	}

	public List<Genero> buscarGeneros (List<Pelicula> peliculas){

		List<Genero> generosEncontrados = new ArrayList<Genero> ();

		for(Pelicula unaPelicula : peliculas) {
			Genero generoDeUnaPelicula = unaPelicula.getGenero()
					;
			if(! generosEncontrados.contains(generoDeUnaPelicula)) {
				generosEncontrados.add(generoDeUnaPelicula);
			}
		} return generosEncontrados;
	}
}

/**
 Forma no recomendada, endeble

public int calcularDuracionTotal (List<Pelicula> peliculas) {
	int duracionTotal =0;

	for(int i=0; i<peliculas.size();i++){

		get lo utilizamos para acceder a una posiciones especificas NO PARA RECORRERLO

		Pelicula unaPelicula = peliculas.get(1);

		duracionTotal += unaPelicula.getDuracion();
	}

	return duracionTotal;
}
 */