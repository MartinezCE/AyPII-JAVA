package CocinaDeUnHotel;

public class Cocinero extends EmpleadosDeCocina {
	
	
	
	public Cocinero (int dni, int dia, int mes, int anio) {
	
		
	super(dni,dia,mes,anio);
	
	
	
	}
	
	
	
	public String cocinar() {
		
		return "Estoy cocicnando";
	}
	
	
	@Override
	
	public String obtenerFechaDeIngreso() {
	return "La fecha de ingreso es\n" +super.obtenerFechaDeIngreso();
		
	}
	
	@Override
	public String obtenerAntiguedad(int dia, int mes, int anio) {
		return "Antiguedad es\n"+super.obtenerAntiguedad(dia, mes, anio);
	}
	
}
