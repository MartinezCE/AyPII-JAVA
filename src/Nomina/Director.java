package Nomina;

public class Director extends Gerente {
	
	private double bono;
	private boolean aplicaBono;
	
	public Director (String nombre, double bono) {
		super(nombre);
		
		this.bono= bono;
		this.aplicaBono = false;		
	}
	
	public void cumplioObjetivo () {
		aplicaBono= true;
	}
	
	@Override
	public int liquidarSueldo () {
		int sueldo = super.liquidarSueldo();
		if(aplicaBono) {
			sueldo += (sueldo * bono);
		}
		return sueldo;
	}

}
