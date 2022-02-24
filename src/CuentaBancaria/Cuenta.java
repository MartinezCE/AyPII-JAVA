package CuentaBancaria;

public abstract class Cuenta {

	private int dni;
	private String nombre;
	private double saldoDeCuenta;
	
	
	public Cuenta (int dni, String nombre) {
		
		validarParametros(dni, 0);
		
		this.setDni(dni);
		this.setNombre(nombre);
		
	}
	
	public Cuenta (int dia, String nombre, double saldoDeCuenta) {
		validarParametros(dia,saldoDeCuenta);
	}
	
	
	private void validarParametros(int dni, double saldoDeCuenta) {
		if((dni<=0)|| (saldoDeCuenta<0) ){
			throw new Error();
		}
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldoDeCuenta() {
		return saldoDeCuenta;
	}

	public void setSaldoDeCuenta(double saldoDeCuenta) {
		this.saldoDeCuenta = saldoDeCuenta;
	}
	
}
