package Ejercicio02;

import java.util.Scanner;

public class Test {
	
	public static void main (String [] args) {
		Examen examen1 = new Examen ("Cristian","29-2",10000);
		Examen examen2 = new Examen ("Ezequiel", "1-3", 15000);
		
		int nota ;
		Scanner leer = new Scanner (System.in);
		System.out.println("Ingrese el valor de la nota");
		nota = leer.nextInt();
		try {
			examen1.setNota(nota);
		} catch (ErrorNotaInvalida e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} int nota2,legajo2;
		System.out.println("Ingrese el nuevo numero de legajo");
		legajo2 = leer.nextInt();
		System.out.println("Ingrese el valor de la nota");
		nota2 = leer.nextInt();
		try {
			examen2.setLegajo(legajo2);
			examen2.setNota(nota2);
		}catch(ErrorLegajoInvalido r) {
			System.out.println(r);
		}catch (ErrorNotaInvalida e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} finally {
			leer.close();
			System.out.println("Programa finalizado");
		}
	}

}
