package CocinaDeUnHotel;

public class EmpledosDeCocinaDemo {
	
	
	public static void main (String [] args) {
		
		EmpleadosDeCocina cocinero2 = new EmpleadosDeCocina (36085194,28,2,1993);
		
		
		Cocinero cocinero = new Cocinero (36085194,29,2,1992);
		
		
		System.out.println(cocinero.obtenerFechaDeIngreso());
		System.out.println(cocinero.obtenerAntiguedad(19, 4, 2020));
		System.out.println(cocinero2.obtenerFechaDeIngreso());
		System.out.println(cocinero.cocinar());
	}

}
