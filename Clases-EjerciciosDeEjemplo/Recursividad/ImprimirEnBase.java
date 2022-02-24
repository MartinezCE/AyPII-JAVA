package Recursividad;

public class ImprimirEnBase {

	public static void main(String [] args) {
		imprimirEnBase(127,10);
		System.out.println();
		imprimirEnBase(127,2);
		System.out.println();
		imprimirEnBase(127,8);
		System.out.println();
		imprimirEnBase(127,16);
		System.out.println();
	}
	private static final String DIGIT_TABLE = "0123456789abcdef";
	private static void imprimirEnBase(int n, int base) {
		
		if(n >= base) {
			imprimirEnBase(n/ base,base);
		}
		System.out.println(DIGIT_TABLE.charAt(n % base));
	}
}
