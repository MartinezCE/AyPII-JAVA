package Ejercicio01;


public class Ejercicio01 {


	public int sumar (String [] numerosEnString) {

		int resultado =0;


		try {

			for(int i = 0 ; i <numerosEnString.length; i++){
				resultado += Integer.parseInt(numerosEnString[i]);

			}
		}
		catch(NumberFormatException e) {
			System.out.println(e);	
		}
		return resultado;


	}

	public static void main (String [] args) {


		String [] numero = new String [3];



		numero[0] = "1";
		numero[1] = "2";
		numero[2] = "Tres";


		Ejercicio01 x = new Ejercicio01();

		System.out.println(x.sumar(numero));

	}
}