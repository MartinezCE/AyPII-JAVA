package Guia02Empleados;

public class Lavacopas extends Empleados{
	
	Lavacopas (long dni, String fechaIngreso, int antiguedad){
		super(dni,fechaIngreso,antiguedad);
	}
	
	
	public void lavarCopas () {
		System.out.println("Lavando copas");
	}
	
}
