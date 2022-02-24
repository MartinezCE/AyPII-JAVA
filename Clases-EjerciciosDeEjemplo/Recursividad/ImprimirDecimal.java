package Recursividad;

public class ImprimirDecimal {

	public static void main (String [] args) {
		imprimirDecimal(127);
	}
	
	public static void imprimirDecimal(int n) {
		if(n>+10) {
			imprimirDecimal(n/10);
		}
		System.out.println(n%10);
	}
}
