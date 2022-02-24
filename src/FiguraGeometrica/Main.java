package FiguraGeometrica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws Exception {

		String[] data = null;
		BufferedReader lector = null;
		ArregloFiguras figurasGeometricas= new ArregloFiguras();

		try {

			FileReader fichero = new FileReader("/Users/cristianmartinez/Desktop/Archivos/datos_para_crear_Figuras.txt");
			lector = new BufferedReader(fichero);

			System.out.println("Comienza la lectura del fichero");
			String unaLinea;
			

			while ((unaLinea = lector.readLine()) != null) {

				data = unaLinea.split(":");
				crearFiguras preFigura = new crearFiguras(data);				
				figurasGeometricas.construirArrayDeFiguras(preFigura.inicializarFiguras());
				
			}

		
		} catch (FileNotFoundException ex2) {
			System.out.println("Mensaje:" + ex2.getMessage());
			
			
		}
		catch(Exception ex3){
			System.out.println("Mensaje:"+ex3.getMessage());
			
		}
		
		finally {
			try {
				lector.close();

			} catch (IOException ex4) {
				System.out.println(ex4.getMessage());

			}

			System.out.println("Lectura completada");

		}

		Arrays.sort(figurasGeometricas.obtenerArrayDeFiguras());

		for (int i = 0; i < figurasGeometricas.obtenerArrayDeFiguras().length; i++) {

			System.out.println("figuras[i].nombreDeFigura()"
					+ figurasGeometricas.obtenerArrayDeFiguras()[i].calcularArea());
		}

	}



}
