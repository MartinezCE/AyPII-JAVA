package PriorityQueue;

public class Cliente implements Comparable <Cliente>{
	
	private String nombre;
	private Integer orden;
	
	private static Integer cantidadDeClientes = 0;
	
	public Cliente(String nombre) {
		cantidadDeClientes++;
		
		this.nombre = nombre;
		this.orden = cantidadDeClientes;
	}
	public String getNombre() {
		return nombre;
	}
	public int getOrden() {
		return orden;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public int compareTo(Cliente cliente) {
		// Orden longitud de palabra
		int longitud1 = nombre.length();
		int longitud2 = cliente.nombre.length();
		int dif = longitud1 - longitud2;
		if ( dif != 0 )
			return dif;
		
		// Orden alfabético
		//return palabra.compareTo(o.palabra);
		
		// Orden de llegada
		return orden.compareTo(cliente.orden);
	}
	
	@Override
	public String toString() {
		return nombre;
	}
}
