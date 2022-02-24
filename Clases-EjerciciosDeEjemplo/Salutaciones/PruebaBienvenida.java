package Salutaciones;

import org.junit.Assert;
import org.junit.Test;

public class PruebaBienvenida {

	@Test
	public void darParaTresPersonas() {
		Saludo[] saludos = new Saludo [] {
				new SaludoInformal("Martin"),
				new SaludoFormal("Senor Moreno"),
				new SaludoInformal ("Lucia")
		};
		
		Bienvenida bienvenida = new Bienvenida (saludos);
		
		Assert.assertEquals("Hola Martin. Buenos Dias Senor Moreno. Hola Lucia", bienvenida.dar());
	}

}
