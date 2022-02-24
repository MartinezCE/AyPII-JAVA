package Guia02Empleados;

public class Cocinero extends Empleados {

	Cocinero(long dni,String fechaIngreso,int antiguedad){
		super(dni,fechaIngreso,antiguedad);
	}
	
	public void cocinar() {
		System.out.println("cocinando");
	}
}
