package Nomina;

public class Operario extends Empleado{
	
	private int valorHoraExtra;
	private int cantidadDeHorasExtras;
	
	public Operario (String nombre, int valorHoraExtra) {
		super(nombre);
		validarMonto(valorHoraExtra);
		this.valorHoraExtra = valorHoraExtra;
		this.cantidadDeHorasExtras=0;
	} 
	
	
	public void asignarHorasExtras(int horas ){
		
		this.cantidadDeHorasExtras = horas;
	}
	
	
	@Override
	
	public int liquidarSueldo() {
		int neto = super.liquidarSueldo();
		
		int extras = valorHoraExtra * cantidadDeHorasExtras; 
		
		return neto+ extras;
	}
	
	
	
}
