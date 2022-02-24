package Ejercicio05;

import java.util.Stack;

public class CalcularStack {

	Stack<Integer>bckPila = new Stack<Integer>();
	int contador =0;
	public int calcular(Stack<Integer> pila) {
		
		if( pila.isEmpty()) {
			return 0;
		}else {
			bckPila.push(pila.pop()) ;
			calcular(pila);
			contador++;
			pila.push(bckPila.pop());
			return contador;
		}
	}
	
	public static void main (String [] args) {
		Stack<Integer>pepe = new Stack <Integer>();
		pepe.push(3);
		pepe.push(3);
		pepe.push(3);
		pepe.push(3);
		CalcularStack pila = new CalcularStack ();
		System.out.println(pila.calcular(pepe));
	}
}
