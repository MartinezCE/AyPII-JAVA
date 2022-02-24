package Guia02Empleados;

public class Empleados {
	
	protected long dni;
	protected String fechaIngreso;
	protected int antiguedad;
	
	Empleados (long dni, String fechaIngreso, int antiguedad){
		this.dni = dni;
		this.fechaIngreso = fechaIngreso;
		this.antiguedad = antiguedad;
	}

	public long getDni() {
		System.out.println(dni);
		return dni;
	}
	
	public String getFechaIngreso() {
		System.out.println(fechaIngreso);
		return fechaIngreso;
	}
	
	public int getAntiguedad() {
		System.out.println(antiguedad);
		return antiguedad;
	}
//	
//	public void setDni() {}
//	public void setFechaIngreso() {}
//	public void setAntiguedad() {}
}
