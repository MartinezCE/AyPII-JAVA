package AlumnoRegular;

public class Examen {
	private String nombreAlumno, fecha;
	private double nota;
	private int numeroDeLegajo;


	public Examen (String nombre, String fecha, int legajo) throws ErrorNumeroDeLegajo{ 

		validarLegajo (legajo);
		this.numeroDeLegajo = legajo;
		this.fecha = fecha;
		this.nombreAlumno = nombre;

	}

	protected void validarLegajo (int legajo) throws ErrorNumeroDeLegajo {
		if(legajo < 10000 || legajo >15000) {

			throw new ErrorNumeroDeLegajo ("El numero de legajo es invalido");
		}
	}


	public String setFecha(String nuevaFecha) {
		
		return this.fecha = nuevaFecha;
	}


	public String setNombreAlumno (String nuevoNombre) {
		return this.nombreAlumno= nuevoNombre;
	}



	public double setNota (double nota) throws ErrorNotaInvalida {

		if(nota<=0 || nota>10 ) {
			throw new ErrorNotaInvalida("La nota ingresada es invalida");
		}
		else {
			this.nota = nota;
		}

		return this.nota;
	}


	public int setNumeroDeLegajo (int legajo) throws ErrorNumeroDeLegajo{

		validarLegajo (legajo);
		this.numeroDeLegajo = legajo;

		return this.numeroDeLegajo;

	}

	public String getFecha() {
		return fecha;
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

}
