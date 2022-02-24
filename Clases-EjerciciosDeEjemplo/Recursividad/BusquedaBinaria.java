package Recursividad;

public class BusquedaBinaria {
final int NO_ENCONTRADO = -1;

	public int busquedaBinaria(int[] array, int x) {
	    return busquedaBinaria(array, 0, array.length - 1, x);
	}

	private  int busquedaBinaria(int[] array, int inicio, int fin, int x) {
	    if (inicio > fin) return NO_ENCONTRADO;

	    int medio = (inicio + fin) / 2;

	    if (array[medio] > x)
	        return busquedaBinaria(array, inicio, medio - 1, x);
	    else if (array[medio] < x)
	        return busquedaBinaria(array, medio + 1, fin, x);

	    return medio;
}
	public static void main (String [] args) {
		BusquedaBinaria buscar= new BusquedaBinaria();
		int[] array = new int [4];
		array[0]=10;
		array[1]=2;
		array[2]=5;
		array[3]=1;
	System.out.println(buscar.busquedaBinaria(array,5));
	}
}
