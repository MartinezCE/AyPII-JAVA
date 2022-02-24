package Ejercicio01;

public class SumarString {

	public int sumar(String [] numeros)  {
		int resultado=0;
		for(int i=0; i<numeros.length;i++) {
			resultado+=Integer.parseInt(numeros[i]);
		}

		return resultado;
	}

	public static void main (String [] args) {

		SumarString nuevaSuma = new SumarString ();
		SumarString nuevaSumaError = new SumarString ();
		//Creo el array sin errores
		//Suma total 14
		String [] numeros = new String [7];
		numeros[0] = "2";
		numeros[1] = "2";
		numeros[2] = "2";
		numeros[3] = "2";
		numeros[4] = "2";
		numeros[5] = "2";
		numeros[6] = "2";
		//Creo un array con Error para que captura la excepcion
		String [] numerosError = new String [4];
		numerosError [0] = "1";
		numerosError [1] = "1";
		numerosError [2] = "uno";
		numerosError [3] = "1";
		try {
			System.out.println(nuevaSuma.sumar(numeros));
			System.out.println(nuevaSumaError.sumar(numerosError));
		}
		catch(Error e){
			System.out.println(e);	
		}
		finally {
			System.out.println("Fin de la ejecucion");
		}
	}

}
