package Guia02Empleados;

public class Ayudante extends Empleados{			
	
	Ayudante (long dni, String fechaIngreso, int antiguedad){
		super(dni,fechaIngreso,antiguedad);
	}
	
	
	
	public void pelarPapas () {
		System.out.println("Pelando papas");
	}

}
