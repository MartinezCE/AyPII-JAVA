package Nomina;

import org.junit.Assert;
import org.junit.Test;

public class PruebaEmpleado {

	@Test
	public void testCrearConNombreSinSueldo() {
		Empleado nuevoEmpleadoUno = new Empleado ("Cristian");
		
		Assert.assertEquals("Cristian", nuevoEmpleadoUno.obtenerNombre());
	}

	@Test
	public void liquidarConSueldoBrutoDe40k () {
		Empleado nuevoEmpleadoUno = new Empleado ("Cristian");
		nuevoEmpleadoUno.cambiarSueldo(40000);
		
		Assert.assertEquals(40000, nuevoEmpleadoUno.obtenerSueldo());
		
	}
	
	
	@Test(expected = Error.class)
	
	public void noSePuedeAsignarSueldoBajo() {
		
		Empleado nuevoEmpleadoUno = new Empleado ("Cristian");
		nuevoEmpleadoUno.cambiarSueldo(-1);
	}
}
