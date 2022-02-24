/**
 * 
 */
package Calificaciones;

/**
 * @author cristianmartinez
 *
 */
public class Nota {


	private int valor = 0;

	public Nota (int valorInicial) {
		
		asignar(valorInicial);
	}

	public Nota() {
		// TODO Auto-generated constructor stub
	}

	public int obtenerValor () {

		return valor;

	}

	public void asignar (int nuevoValor) {
		validar(nuevoValor);
		valor = nuevoValor;

	}
	private void validar (int nuevoValor) {

		if ((nuevoValor <0)|| (nuevoValor > 10)) {

		}
	}
	public boolean aprueba () {

		return valor >= 4;
	}
}
