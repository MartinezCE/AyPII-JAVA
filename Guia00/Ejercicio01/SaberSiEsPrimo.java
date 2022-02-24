package Ejercicio01;

import java.util.Scanner;

public class SaberSiEsPrimo {

	public static void main (String [] args) {

		SaberSiEsPrimo validarNumero = new SaberSiEsPrimo ();

	}
	public int numero;

	SaberSiEsPrimo (){
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
		}else if(var == 2) {
			System.out.println("Gracias por jugar");
		}
	}
	private boolean esPrimo (int numero) {
		return(numero % 1 == 0 && numero % numero ==0 && numero %2 !=0 || numero ==2 )? true : false;
	}
}
