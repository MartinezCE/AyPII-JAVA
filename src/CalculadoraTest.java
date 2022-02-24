import org.junit.After;
import org.junit.Test;

public class CalculadoraTest {


	Calculadora calcu1 = new Calculadora ();


	@After
	public void setup () {

		calcu1.borrarMemoria ();
	}

	@Test
	public void test() {
	}

}
