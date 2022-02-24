package Ejercicio10;



public class Binario {
	
	public static void main (String []args) {

		Binario convertir = new Binario();
		System.out.println(convertir.convertirABinaro(36));

	}
		public int convertirABinaro (int decimal) {
			

			if (decimal< 2) {
				return decimal;
			}else {
				return decimal%2+convertirABinaro(decimal/2)*10;
			}
			
		}

		
	}
