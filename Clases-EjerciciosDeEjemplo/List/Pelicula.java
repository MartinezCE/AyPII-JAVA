package List;

public class Pelicula {
	
	private String titulo;
	private Genero  genero;
	private int duracion;
	
	public Pelicula (String nombre, Genero genero, int duracion) {
		this.genero= genero;
		this.titulo = nombre;
		this.duracion = duracion;

	}

	public String getTitulo() {
		return titulo;
	}

	public Genero getGenero() {
		return genero;
	}

	public int getDuracion() {
		return duracion;
	}
	
	
	
	
}
