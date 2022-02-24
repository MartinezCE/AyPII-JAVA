package Queues;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PruebaPizzeria {
	Pizzeria pizzeria = new Pizzeria ();

	@Test
	public void terminoUnaPizza() {
		pizzeria.tomarOrden(Pizza.FUGAZZA);
		pizzeria.preparar();
		pizzeria.hornear();
		pizzeria.entregar();
		
		Assert.assertTrue(pizzeria.termino());
		Assert.assertEquals(0, pizzeria.contarPendientes());
		
	}

		public void tomo4OrdenesPreparo2Horneo1Entrego1() {
			pizzeria.tomarOrden(Pizza.FUGAZZA);
			pizzeria.tomarOrden(Pizza.JAMON);
			pizzeria.preparar();
			pizzeria.tomarOrden(Pizza.NAPOLITANA);
			pizzeria.hornear();
			pizzeria.preparar();
			pizzeria.entregar();
			pizzeria.tomarOrden(Pizza.MUZZARELLA);
			
			Assert.assertFalse(pizzeria.termino());
			Assert.assertEquals(3, pizzeria.contarPendientes());
		}
}
