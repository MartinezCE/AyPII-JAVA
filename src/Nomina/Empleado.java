package Nomina;

public class Empleado {
	
	private int sueldo;
	private String nombre;
	
	public Empleado (String nombre) {
		this.nombre= nombre;
	}
	
	public String obtenerNombre () {
		return nombre;
	}
	
	public int obtenerSueldo () {
		return this.sueldo;
	}
	
	public int liquidarSueldo() {
		return (int) (sueldo*0.8);
	}

	
	public void cambiarSueldo (int nuevoSueldo) {
			validarMonto(nuevoSueldo);
			this.sueldo = nuevoSueldo;
		
	}
	
	protected void validarMonto(int monto) {
		
		if(monto <0 ) {
			throw new Error ("Monto invalido, debe ser mayor a cero");
		}
	} 
	
	

}
