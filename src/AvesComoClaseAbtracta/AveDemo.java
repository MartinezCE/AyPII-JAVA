package AvesComoClaseAbtracta;

public class AveDemo {


	public static void main (String [] args) {
		
		//Ave miAve = new Ave(); 
		//no se puede instanciar porque es abstracta
		
		// Generamos 3 instancias de la clase
		
		Ganso unGanso = new Ganso ();
		Pingüino unPingüino = new Pingüino();
		Golondrina unaGolondrina = new Golondrina ();

		// Lo guardamos en un arreglo 

		Ave[] aves = new Ave[3];
		aves[0] = unGanso;
		aves[1] = unPingüino;
		aves[2] = unaGolondrina;

			// Recorremos pidiendo el color y como se mueve
			
		for (int i= 0; i< aves.length; i++) {
			System.out.println(aves[i].getColor());
			System.out.println(aves[i].mover());
		}
	}




}
