package Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Ayudante {
	
Map <String,String> respuetas;

	public Ayudante() {
	
		this.respuetas = new HashMap<String,String>();
		agregarRespuestas();
	}
	
	public void agregarRespuestas() {
		this.respuetas.put("ayuda lavarropas", "Que modelo de lavarropas es?");
		this.respuetas.put("Lavatodo 200", "Que le sucede a su lavarropas");
		this.respuetas.put("No centrifuga", "Pruebe hacer un lavado sin ropa");
	}
	
	public String buscarRespuesta(String palabra) {
		return this.respuetas.get(palabra);
	}
	
	public static void main (String[] args) throws IOException{
		
		Ayudante jorge = new Ayudante();
		String palabraClave;
		BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
	
		System.out.println("Hola, en que puedo ayudarlo?");
		palabraClave = in.readLine();
		System.out.println(jorge.respuetas.get(palabraClave));
		palabraClave = in.readLine();
		System.out.println(jorge.respuetas.get(palabraClave));
		palabraClave = in.readLine();
		System.out.println(jorge.respuetas.get(palabraClave));
		palabraClave = in.readLine();
	}
}
