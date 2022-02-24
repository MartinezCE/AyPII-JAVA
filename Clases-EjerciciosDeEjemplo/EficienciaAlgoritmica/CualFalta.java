package EficienciaAlgoritmica;

public class CualFalta {
	public static int quienFaltaLineal(int v[]){
		for(int i=0; i<v.length;i++){
			if(v[i]>i)
				return i;
		}
		return -1;
	}
	public static int quienFaltaLog(int v[]){
		int inicio=0;
		int fin=v.length-1;
		int medio=(fin+inicio)/2;
		int encontrado=-1;
		while(encontrado<0){
			int aux=medio;
			if(medio==v[medio]){
				inicio=medio;
				medio=(inicio+fin)/2;
			 }
			if(medio<v[medio]){
				fin=medio;
			 	medio=(inicio+fin)/2;
			}	
			if(medio==aux) encontrado=fin;
		}
		if(encontrado==v[fin]) return -1;
		return encontrado;
	}
	public static int[] generarVector(int tam){
		int vec[] = new int [tam];
		for(int i=0; i<tam;i++)
			vec[i]=i;
		vec[tam-1]=tam;
		return vec;
	}
	public static void pruebaRendimiento(int[] v, int corridas){
		//Dado que ambos algoritmos parecen tener tiempos de respuesta similares, 
		//se ejecutarán ambas implementaciones "muchas" veces para que se haga apreciable la
		//diferencia en sus tiempos de respuesta. 
		int aux;
		long tIni = System.currentTimeMillis();
		for(int i=0;i<corridas;i++)
			aux=quienFaltaLineal(v);
		long tFin = System.currentTimeMillis();
		long diff = tFin - tIni; 
		System.out.println("  Tiempo de ejecucion del algoritmo lineal: "+diff);
		tIni = System.currentTimeMillis();
		for(int i=0;i<corridas;i++)
			aux=quienFaltaLog(v);
		tFin = System.currentTimeMillis();
		diff = tFin - tIni; 
		System.out.println("  Tiempo de ejecucion del algoritmo logaritmico: "+diff);
	}
	public static void main(String[] args) {
		int []myVectorCompleto={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		int []myVectorFaltaMitadInferior={0,1,3,4,5,6,7,8,9,10,11,12,13,14};
		int []myVectorFaltaMitadSuperior={0,1,2,3,4,5,6,7,8,9,10,11,15};
		int []myVectorFaltacero={1,2,3,4,5,6,7,8,10,11,15};
		int []grandote = generarVector(1000000);
		System.out.println(quienFaltaLog(myVectorCompleto));
		System.out.println(quienFaltaLog(myVectorFaltaMitadInferior));
		System.out.println(quienFaltaLog(myVectorFaltaMitadSuperior));
		System.out.println(quienFaltaLog(myVectorFaltacero));
		System.out.println(quienFaltaLog(grandote));
		System.out.println(quienFaltaLineal(myVectorCompleto));
		System.out.println(quienFaltaLineal(myVectorFaltaMitadInferior));
		System.out.println(quienFaltaLineal(myVectorFaltaMitadSuperior));
		System.out.println(quienFaltaLineal(myVectorFaltacero));
		System.out.println(quienFaltaLineal(grandote));
		pruebaRendimiento(grandote,10000);
	}

}
