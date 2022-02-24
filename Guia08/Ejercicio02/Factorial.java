package Ejercicio02;

public class Factorial {
	
	public static void main (String [] args) {
		Factorial numero = new Factorial ();
		System.out.println(numero.devolverFactorial(5))
		;
	}
	

	public int devolverFactorial (int n) {
		int factorial ;
		if(n==1){
			return 1;
		}
		else  {
			return factorial= n * devolverFactorial(n-1);
		}
		
	}

}
