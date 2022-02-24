package Nomina;

import org.junit.Assert;
import org.junit.Test;
public class PruebaGerente {
	
	@Test (expected = Error.class)
	public void testNoSePuedeAsignarViaticosNegativos() {
		Gerente gerente = new Gerente ("Layla");
	    gerente.asignarViaticos(-1);
	}
	
	
	@Test
	public void liquidarConSueldosBrutosDe60KCoonViaticosDe10K () {
		Gerente gerente = new Gerente ("Layla");
		gerente.cambiarSueldo(60000);
		gerente.asignarViaticos(10000);
		
		
		Assert.assertEquals(58000, gerente.liquidarSueldo());
		
	}

}
