package Stack;

import java.util.Stack;

// L.I.F.O
// Last In First Out



public class Historial {

	private Stack <String> acciones = new Stack <String>();
	
	public void aplicar (String accion) {
		acciones.push(accion); // se guardan dentro de la estructura
		
		System.out.printf("`push%-15s %s %n" , "(" + accion + ")" , acciones); 
		// cada vez que hay un push mostramos la operacion por consola y mostramos como esta la accion de pila
		
	}
	
	
	public void deshacer () {
		// evaluamos si la pila no esta vacia, si es asi removemos.
		if(! acciones.isEmpty()) { 
			
			String paso = acciones.pop();
			System.out.printf("Pop() -> -10s %s %n", paso, acciones);
		}
		else {
			System.out.printf("isEmpty ()    %s %n ", acciones);
		}
	}
	
	
}
