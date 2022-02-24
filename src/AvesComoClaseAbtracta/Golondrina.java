package AvesComoClaseAbtracta;

public class Golondrina extends Ave{

	
	public Golondrina () {
		super();
		setColor("azul y blanco");
	}
	
	public String migrar() {
		return "Ave migratoria";
	}
	@Override
	public String mover() {
		return "Su moviemiento es:\nAve migratoria";
	}
}
