package Guia02Empleados;

public class Main {

	public static void main (String [] args) {

		Cocinero cris = new Cocinero(36085194,"10-20",1);
		cris.getDni(); 
		cris.getFechaIngreso();
		cris.getAntiguedad();
		cris.cocinar();
		Empleados 	misEmpleados2 = new Lavacopas(36085200,"1-20",2);
		Empleados 	misEmpleados3 = new Ayudante(36085100,"5-20",3);


	}

}
