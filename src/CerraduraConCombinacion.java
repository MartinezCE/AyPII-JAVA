import java.util.Scanner;

public class CerraduraConCombinacion {
	
	public int combinacion, combinacionAnterior ;
	
	
	CerraduraConCombinacion (){
		Scanner leer  = new Scanner(System.in);
		System.out.println("Ingrese el primer digito");
		String numero1 = leer.next();
		System.out.println("Ingrese el segundo digito");
		String numero2 = leer.next();
		System.out.println("Ingrese el tercer digito");
		String numero3 = leer.next();
		
		String combinacionString = numero1 + numero2 +numero3;
		this.combinacion = Integer.parseInt(combinacionString);
		
	}
	
	public void setCombinacion () {
		Scanner leer = new Scanner (System.in);
		System.out.println("Por favor ingrese la anteultima contrasena");
		int combinacionAnterior = leer.nextInt();
		if(combinacionAnterior == this.combinacion) {
		System.out.println("Ingrese la contrana nueva");
		this.combinacion =leer.nextInt();
		System.out.println("La contrasena se cambio con exito");
		}else {System.out.println("La contrasena antigua es incorrecta");
		}
	}
	
	public static void main (String [] args) {
		CerraduraConCombinacion test = new CerraduraConCombinacion();
		
		test.setCombinacion();
	}

}
