package AvesComoClaseAbtracta;

public class Ganso extends Ave{

	public Ganso () {
		setColor("Gris");
	}
	
	@Override
	public String getColor() {
		return "El ganso es de color \n" + super.getColor();
	}
	
	@Override
	
	public String mover () {
		return "Sus movimientos son :\nNadar, caminar y volar";
		
	}
	
	
	
}
