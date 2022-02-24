package Recursividad;

public class Palindro {
	
	
	
	public  boolean esPalindromo (String texto) {
		
		//condicion de corte
		if(texto.length() <= 1) {
			return true;
		}
		char primero = texto.charAt(0);
		char ultimo = texto.charAt(texto.length()-1);
		//Reduccion: convertir problema original en uno mas pequeneo
		String interior = removerExtremos(texto);
		return (primero == ultimo) && esPalindromo(interior);
	}
	
	private  String removerExtremos(String texto) {
		return texto.substring(1,texto.length()-1);
	}
	
	public static void main (String [] args) {
		
		Palindro test = new Palindro ();
		
		String texto = "animallamina";
		System.out.println(
		test.esPalindromo(texto));	
		}

}
