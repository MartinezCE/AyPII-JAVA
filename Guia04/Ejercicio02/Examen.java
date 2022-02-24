package Ejercicio02;

public class Examen {

	public String fecha,nombre;
	public int legajo, nota;
	
	Examen (String fecha, String nombre, int legajo){
		this.nombre = nombre;
		this.fecha = fecha;
		this.legajo = legajo;
	}
	
	public void setFecha (String nuevaFecha) {
		this.fecha = nuevaFecha;
	}
	
	public void setNombre (String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
	
	public void setLegajo (int nuevoLegajo) throws ErrorLegajoInvalido {
		validarLegajo(nuevoLegajo);
		this.legajo = nuevoLegajo;
	}
	
	public void setNota (int nuevaNota) throws ErrorNotaInvalida {
		validarNota(nuevaNota);
		this.nota = nuevaNota;
	}
	
	private void validarNota (int nota) throws ErrorNotaInvalida{
		if(nota<1 || nota>10) {
			throw new ErrorNotaInvalida ();
		}
	}
	
	private void validarLegajo (int legajo) throws ErrorLegajoInvalido {
		if(legajo <10000 || legajo>15000) {
			throw new ErrorLegajoInvalido();
		}
	}
}
