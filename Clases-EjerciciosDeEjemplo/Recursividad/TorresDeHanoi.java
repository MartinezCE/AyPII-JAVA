package Recursividad;

public class TorresDeHanoi {
	 public static void main(String[] args) {
		    int n = 3;
		    mover(n, 'A', 'B', 'C');
		  }

		  public static void mover(int n, char origen, char aux, char destino) {
		    if (n == 1) {
		      System.out.println("disco: " + n + ": "  + origen + " > " + destino);
		    } else {
		      mover(n - 1, origen, destino, aux);
		      System.out.println("disco: " + n + ": "  + origen + " > " + destino);
		      mover(n - 1, aux, origen, destino);
		    }
		  }

}
