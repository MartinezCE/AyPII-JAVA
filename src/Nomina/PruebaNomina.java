package Nomina;

import org.junit.Assert;
import org.junit.Test;

public class PruebaNomina {
	
	private Nomina nomina = new Nomina (10);

	@Test
	public void promediarSueldoConUnUnicoEmpleado() {
		
		Empleado empleado = new Empleado ("tita");
		empleado.cambiarSueldo(50000);
		
		nomina.agregarEmpleado(empleado);
		
		
		Assert.assertEquals(40000, nomina.promediarSueldos());
	}
	
	
	@Test
	public void promediarSueldoConTresEmpleados () {
		
		Empleado cajero = new Empleado ("Simon");
		cajero.cambiarSueldo(30000);
		nomina.agregarEmpleado(cajero);
		
		
		Empleado vendedora = new Empleado ("Allegra");
		vendedora.cambiarSueldo(35000);
		nomina.agregarEmpleado(vendedora);
		
		Empleado limpieza = new Empleado ("Beji");
		limpieza.cambiarSueldo(50000);
		nomina.agregarEmpleado(limpieza);
		
		Assert.assertEquals(30666, nomina.promediarSueldos());
	}

}
