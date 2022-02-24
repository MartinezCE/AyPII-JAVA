package Recursividad;

public class DivideAndConquer {
	public static void main (String [] args) {
		System.out.println(potencia(3.78,14));//121.586.455,41
	}

	private static double potencia(double x, int n) {
		if(n ==1)
			return x;
		return potencia(x,n/2)* potencia (x,n-n/2);
	}
}
 