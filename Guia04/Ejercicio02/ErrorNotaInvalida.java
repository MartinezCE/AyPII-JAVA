package Ejercicio02;

public class ErrorNotaInvalida extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 276382729233202644L;
	

	ErrorNotaInvalida(){
		super("Valor de nota de examen incorrecto.");
	}
}
