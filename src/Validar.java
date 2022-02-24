/**
 * 
 * @author cristianmartinez
 * Escribir una función que reciba un número n y devuelva true si n es primo o false en caso contrario.
 */
import java.util.Scanner;

public class Validar {

	
	public static void main (String [] args) {
		
		Validar validarNumero = new Validar ();
		
	}
	public int numero;
	
	Validar (){
		leerNumero();
	}
	private void leerNumero() {
		int var ;
		Scanner leer = new Scanner(System.in);
		System.out.println("Introdusca un numero entero: ");
		this.numero = leer.nextInt();
		System.out.println("El numero introducido es: "+ numero);
		System.out.println("El numero ingresado es primo? " + esPrimo(numero));
		System.out.println("Desea ingresar otro numero? ");
		System.out.println("1-Si  o 2-No ?");
		var = leer.nextInt();
		if (var == 1) {
			leerNumero();
		}else {
			System.out.println("Gracias por jugar");
		}
	}
	private boolean esPrimo (int numero) {
		return(numero % 1 == 0 && numero % numero ==0 && numero %2 !=0 || numero ==2 )? true : false;
	}
	

}
