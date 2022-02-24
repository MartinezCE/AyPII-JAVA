package EntradasSalidas;

public class UsandoSplit {
	
	public static void main (String [] args) {
		
		
		String texto = "criculo: 1,2,4,5\n"+ "Rectangulo : 1,2,3,4\n"	+ "dni: 1212121212, nombre: cris, \napellido: Martinez";
		
		String [] datos;
		
		//Split() metodo de la clase String
		datos = texto.split(",");
		
		for(String dato : datos) {
			dato = dato.trim();
		
		for(String campo : dato.split(":")) {
			
			// El metodo TRIM () permite remover los espacios antes y despues del texto 
			campo = campo.trim();
			System.out.println(campo);
			
		}
	}
		
		
		
		
		
	}
}
/** Para crear una salida nueva.                                             #################
 *                            												#				 #
 * FileWrier escritoraA = new FileWriter ("file.txt");						#	UNO			 #
 * estiroraA.write ("uno\n");												#	DOS			 #
 * estoraA.close();  cuando cerramos nos garantizamos que lo guarde			##################	
 * 																			
 * 
 * 
 * 
 * para abrir el archivo y escribir
 * 
 * FileWriter escritorB = new FileWriter ("file.txt",true);
 * escritorB.write ("Dos\n");
 * escritorB.close ();
 * 
 * 
 * 
 * FileReader lector = new fileReader ("file.txt");
 * BufferedReader buffer = new BufferedReader (lector);
 * String linea;
 * while ((linea = buffer.readLine()) != null) {
 * System.out.println(s);
 * }
 * lector.close();
 * 
 * 
 * 
 */

