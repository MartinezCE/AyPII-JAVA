package List;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Cartelera {

	private String archivo;

	public Cartelera(String string) {
		this.archivo = string;
	}



	public List<Pelicula> obtenerPeliculas() throws ExceptionEnElCine{ // este metodo podria lanzar una excepcion   

		//implementacion concreta de lista enlazada

		List<Pelicula> peliculas = new LinkedList<Pelicula>();

		try {

			cargar(peliculas);

		}

		catch (IOException e) {

			throw new ExceptionEnElCine("No se pudo leer el archivo de peliculas",e);
		}

		return peliculas;

	}


	private Pelicula crearPelicula (String linea) throws ExceptionEnElCine{
		String [] campos = linea.split(",");

		try{
			String titulo = campos[0].trim();
			Genero genero = Genero.valueOf(campos[1].trim());
			int duracion = Integer.parseInt(campos[2].trim());

			return new Pelicula (titulo,genero,duracion);
		}

		catch (Exception e){

			throw new ExceptionEnElCine("El formato es incorrecto",e);
		}

	}

	private void cargar(List<Pelicula> peliculas) throws ExceptionEnElCine, IOException{

		BufferedReader lector = new BufferedReader (new FileReader(archivo));

		try {

			String linea = lector.readLine();

			while(linea!= null) {
				linea = linea.trim();
				if(!linea.isEmpty());
				Pelicula unaPelicula = crearPelicula(linea);
				peliculas.add(unaPelicula);
			}

			linea = lector.readLine();
		}
		finally{
			lector.close();
		}

	}




}
