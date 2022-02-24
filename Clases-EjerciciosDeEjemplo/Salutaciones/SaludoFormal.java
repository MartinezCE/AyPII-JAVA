package Salutaciones;

public class SaludoFormal extends Saludo{

	
	public SaludoFormal (String nombre) {
		super(nombre);
		
	}
	
	
	
	public String obtener () {
		return "Buenos Dias" + this.nombre;
	}
}
