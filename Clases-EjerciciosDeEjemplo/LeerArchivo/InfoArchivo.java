package LeerArchivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InfoArchivo {
	
	
	public void leerArchivo (String ruta) throws IOException {
		FileReader fr = null;
		BufferedReader br = null;
		
		
		try {
		
		//creamos el objeto y le pasamos la ruta
		fr = 	new FileReader (ruta);
		// leemos el archivo con el objeto br
		br = new BufferedReader (fr);
		
		String lectura = " ";
		String contenido = " ";
		
		
		while((lectura = br.readLine()) != null) {
			
		contenido += lectura+"\n";
		}	
		
	
		System.out.println("Contenido del archivo:\n"+contenido);
	}
		catch (FileNotFoundException k) {
			k.printStackTrace();
		}
		
		finally {
			
			try {
				br.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

	}


