package Ejercicio01;

public class Bosque {
	
	public static void main(String[] args) {
        Animal unAnimal = new Leon();
   //     Leon unLeon = new Animal();  no se puede asignar a un leon un objeto animal
     //   Planta unaPlanta = new Planta(); la clase planta es abstracta
        Leon otroLeon = new Leon();
        otroLeon.nombre = "Timba";
      //  otroLeon.peso = 58;  peso tiene la palabra private, hay que modificarla a protected
        otroLeon.edad = 7;
      //  otroLeon.numero = 3; estamos una variable statica final.
    }

}
