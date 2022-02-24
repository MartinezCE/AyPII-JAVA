package AlumnoRegular;
import java.util.Scanner;

public class Prueba {

	public static void main (String [] args) throws ErrorNumeroDeLegajo {

		Scanner teclado = new Scanner (System.in);
		Examen miExamen;

		try {
			System.out.println("Por favo, ingrese el nombre del alumno:");
			String nombre = teclado.nextLine();
			System.out.println("Por favo, ingrese la fecha:");
			String fecha = teclado.nextLine();
			System.out.println("Por favo, ingrese el Nro de legajo del alumno:");
			int legajo = teclado.nextInt();

			miExamen = new Examen (nombre, fecha,legajo);

			System.out.println("Por favo, ingrese la nota del alumno:");
			double nota;
			nota = teclado.nextDouble();
			miExamen.setNota(nota);

		}

		catch (ErrorNumeroDeLegajo l) {
			
			// Este tipo de msj es para el usuario
			System.out.println("Error  - Tipo de Error :" + l.getMessage());
			//l.printStackTrace();
		}


		catch (ErrorNotaInvalida s) {
			//Este tipo de msj es para nosotros 
			s.printStackTrace();
		}

		finally {

			if (teclado != null) {
				teclado.close();
			}

			System.out.println("Saliendo...");
			System.exit(1);
		}




















	}

}
