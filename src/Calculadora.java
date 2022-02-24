
public class Calculadora {
	
	private int resultado = 0;
	
	public void sumar (int valor ) {
		this.resultado += valor;
	}
	 
	public int obtenerResultado () {
		return this.resultado;
	}
	
	public void borrarMemoria () {
		this.resultado = 0;
	}

}
