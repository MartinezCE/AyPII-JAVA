package LeerArchivo;

import java.io.IOException;

public class PruebaLeer {
	
	public static void main (String [] args) throws IOException {
		
		
		InfoArchivo info1 = new InfoArchivo ();
		info1.leerArchivo("/Users/cristianmartinez/Desktop/Archivos/datos_para_crear_Figuras.txt");
	}

}
