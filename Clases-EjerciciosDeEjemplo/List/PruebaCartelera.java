package List;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PruebaCartelera {

	@Test
	public void obtenerPeliculas() throws ExceptionEnElCine {
		
		Cartelera cartelera = new Cartelera ("datos/peliculas.txt");
		
		List<Pelicula> peliculas = cartelera.obtenerPeliculas();
		Assert.assertFalse(peliculas.isEmpty());
		
		Pelicula primerPelicula =peliculas.get(0);
		
		Assert.assertEquals("Matrix", primerPelicula.getTitulo());
		Assert.assertEquals(Genero.ACCION,primerPelicula.getGenero());
		Assert.assertEquals(136,primerPelicula.getDuracion());
		
		Assert.assertEquals(5, peliculas.size()); 
		 
	}

}
