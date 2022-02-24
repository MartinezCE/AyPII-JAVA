package Salutaciones;

public class SaludoDeCumpleanios extends Saludo{

	
	
	public SaludoDeCumpleanios (String nombre) {
		super(nombre);
		
	}
	
	
	@Override
	public String obtener () {
		return "Feliz cumpleanos" + this.nombre+ ", que pases un lindo dia";
	}
}
