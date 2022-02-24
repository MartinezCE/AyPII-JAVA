package AvesComoClaseAbtracta;

public class Pingüino extends Ave{

	
	public Pingüino () {
		super();
		setColor("Blanco y negro");
		
	}
	
	public String getColor () {
		return "El pinguino es de color\n" + super.getColor();
	}
	
	public String patinar () {
		return "patinando sobre la panza";
	}
	
	
	@Override
	public String mover () {
		return "Sus movimientos son:\rCaminar y nadar";
	}
}
