package Ejercicio01;

import java.util.Stack;

public class CaracteresInversos {
	
	private Stack <Character> caracteres ;
	
	CaracteresInversos(){
		caracteres = new Stack <Character>();
	}
	
	public void agregarCaracter(Character letra) {
		caracteres.push(letra);
		
		System.out.printf("push%-15s %s %n" , "(" + letra + ")" , caracteres);
	}
	
	public void desapilarCaracteres() {
		
		if(! caracteres.isEmpty()) {
			
		Character paso = caracteres.pop();
		System.out.printf("Pop() -> -10s %s %n", paso, caracteres);
	}
	else {
		System.out.printf("isEmpty ()    %s %n ", caracteres);
	}
	}

	
	public static void main (String [] args) {
		
		CaracteresInversos test = new CaracteresInversos ();
		test.agregarCaracter('h');
		test.agregarCaracter('o');
		test.agregarCaracter('l');
		test.agregarCaracter('a');
		
		
		test.desapilarCaracteres();
		test.desapilarCaracteres();
		test.desapilarCaracteres();
		test.desapilarCaracteres();
	}
}
