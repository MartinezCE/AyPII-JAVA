package Recursividad;

public class Palindromo {

	public static void main (String [] args) {
		System.out.println(esPalindromo("ANIMALLAMINA"));
	}
	
	public static boolean esPalindromo (String texto) {
		System.out.println("‘" + texto +"‘");
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
	
	private static String removerExtremos(String texto) {
		return texto.substring(1,texto.length()-1);
	}
	
	
}
