
public class Guia01 {
	public static void main (String [] args) {
		
		/**
		 * Creo un nuevo objeto del tipo Persona, pque recibe por parametro una variable de tipo String y otro de tipo int, Esto resultado es asignado a la variable p1
		 * Ahora p1 apunta a esta objeto
		 */
		
		Persona p1 = new Persona ("Jose Ramirez Mota", 32);
		
		Persona p2 = new Persona ("Lucas Gomez", 29);
		
		Persona p3 = new Persona ("Jose Ramirez Mota", 32);
		
		// asigno el valor objeto referenciado por la variable p2 al objeto referenciado por la variable p1
		
		p1 = p2;
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		System.out.println(p1.equals(p2));
		
	}
}
