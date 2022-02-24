package FiguraGeometrica;

public class ArregloFiguras {
	
	private Figuras figurasGeometricas []= new Figuras[10];
	private int indiceDeEscritura=0;

	
	public boolean sePuedeAgregarFiguras(){
		
	    boolean agregarFiguras = false;
		
		if(indiceDeEscritura<10){
		
		agregarFiguras= true;	
			
		}
		
		return agregarFiguras;
		
	}
	
	    public void construirArrayDeFiguras(Figuras unaFigura){
		
		
		if(sePuedeAgregarFiguras()){
		this.figurasGeometricas[indiceDeEscritura]= unaFigura;
		indiceDeEscritura++;
		}
		else{
		System.out.println("El arreglo de figuras esta lleno"+".");
		}
	   }
	    
	    public Figuras[] obtenerArrayDeFiguras(){
	    	
	    	return figurasGeometricas;
	    }

}
