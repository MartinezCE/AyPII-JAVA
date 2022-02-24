package Calificaciones;

public class NotaDeTP extends Nota {

	private String grupo;




	public NotaDeTP (int valor ) {

		super(valor);
	}

	
	public void nombrarGrupo (String nombre) {
		this.grupo = nombre;
	}

	public String obtenerGrupo () {

		return grupo;
	}
}
