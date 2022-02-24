package PriorityQueue;

import java.util.PriorityQueue;

public class Banco {
	private static PriorityQueue<Cliente> colaDeClientes;
	
	public static void main(String[] args) {
		
		colaDeClientes = new PriorityQueue<Cliente>();
		
		colaDeClientes.add(new Cliente("lucas"));
		colaDeClientes.add(new Cliente("martin"));
		colaDeClientes.add(new Cliente("leonardo"));
		colaDeClientes.add(new Cliente("valeria"));
		colaDeClientes.add(new Cliente("rosita"));		
		colaDeClientes.add(new Cliente("leandro"));
		colaDeClientes.add(new Cliente("lucas"));
		colaDeClientes.add(new Cliente("mariano"));
		colaDeClientes.add(new Cliente("andres"));
		
		while ( !colaDeClientes.isEmpty() ) {
			Cliente p = colaDeClientes.poll();
			System.out.println(p + " " + p.getOrden());
		}
	}
}
