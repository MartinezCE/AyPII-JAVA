package Stack;

import java.util.Stack;

public class Sumador {

	private Stack<Integer> sumados;
	private int resultado ;


	public Sumador () {
		sumados = new Stack<Integer>();
		resultado = 0;
	}

	public void sumar (int valor) {

		resultado += valor;
		sumados.push(valor);

	}

	public int obtenerResultado () {
		return resultado;
	}

	public void deshacer () {
		if(!sumados.isEmpty()) {
			//sacamos el ultimo valor y lo restamos
			int valor = sumados.pop();
			resultado -= valor;
		}
	}

}
