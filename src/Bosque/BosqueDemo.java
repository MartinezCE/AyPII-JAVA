package Bosque;

public class BosqueDemo {
	
	 public static void main(String[] args) {
	        
		 Animal unAnimal = new Leon();
	        
		 unAnimal.crecer();
		 
	        
	        //al objeto del tipo leon, con variable de nombre unLeon, no se le puede asignar un nuevo animal
	        //Leon unLeon = new Animal();
	        
	        
	        // New planta no se puede inicializar porque es abstracta
	        //Planta unaPlanta = new Planta();
	        
	        
	        Leon otroLeon = new Leon();
	        
	        otroLeon.nombre = "Timba";
	        
	        //Peso hay modificarlo y pasarlo a protected
	        otroLeon.peso = 58;
	        
	        
	        otroLeon.edad = 7;
	        
	       // estamos usando una variable final que no se puede modificar 
	       // otroLeon.numero = 3;
	    }


}
