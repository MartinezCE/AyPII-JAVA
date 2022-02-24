/**
 * 
 */
package Calificaciones;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author cristianmartinez
 *
 */
public class PruebaNotaDeTP {

	@Test
	public void crearNotaDeTPConValorCero() {
		NotaDeTP notaDeTP = new NotaDeTP (0);
		int valor = notaDeTP.obtenerValor();
		Assert.assertEquals(0, valor);	
		}
	
	@Test
	public void crearNotaDeTPConValorSeis() {
		NotaDeTP notaDeTP = new NotaDeTP (6);
		Assert.assertEquals(6,notaDeTP.obtenerValor());
	}
	@Test
	public void asignarValor8 () {
		NotaDeTP notaDeTP = new NotaDeTP (0);
		notaDeTP.asignar(8);
		Assert.assertEquals(8,notaDeTP.obtenerValor());
	}
	
	@Test
	public void apruebaCon8 () {
		NotaDeTP notaDeTP = new NotaDeTP(0);
		notaDeTP.asignar(8);
		Assert.assertTrue(notaDeTP.aprueba());
	}
	
	@Test
	public void nombrarElGrupo () {
		NotaDeTP notaGrupal = new NotaDeTP(0);
		notaGrupal.nombrarGrupo("Coders");
		
		Assert.assertEquals("Coders",notaGrupal.obtenerGrupo());
		
	}
}
