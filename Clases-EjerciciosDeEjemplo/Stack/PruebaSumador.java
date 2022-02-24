package Stack;

import org.junit.Assert;
import org.junit.Test;

public class PruebaSumador {
	
	private Sumador sumador = new Sumador ();

	@Test
	public void sumarValorUnico() {
		sumador.sumar(56);
		
		Assert.assertEquals(56, sumador.obtenerResultado());
	}

	@Test
	public void sumarDosValores() {
		sumador.sumar(16);
		sumador.sumar(23);
		
		Assert.assertEquals(39, sumador.obtenerResultado());
	}
	
	@Test
	public void sumarDosValoresPeroLuegoDeshacer() {
		sumador.sumar(16);
		sumador.sumar(23);
		sumador.deshacer();
		Assert.assertEquals(16, sumador.obtenerResultado());
		
	}
	
	@Test 
	public void sumarUnValorLuegoDeshacerloLuegoSumarOtro() {
		
		sumador.sumar(5);
		sumador.deshacer();
		sumador.sumar(8);
		Assert.assertEquals(8, sumador.obtenerResultado());
	}
	
	
	@Test
	public void  sumarCincoValoresPeroDeshacerTodos() {
		sumador.sumar(1);
		sumador.sumar(2);
		sumador.sumar(3);
		sumador.sumar(4);
		sumador.sumar(5);
		sumador.deshacer();
		sumador.deshacer();
		sumador.deshacer();
		sumador.deshacer();
		sumador.deshacer();
		Assert.assertEquals(0, sumador.obtenerResultado());
		
	}
}
