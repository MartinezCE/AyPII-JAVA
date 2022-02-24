package FiguraGeometrica;

public class Punto implements MoverFigura {

	private double posicionX;
	private double posicionY;
	
	
	public Punto(double posicionX,double posicionY){
		this.posicionX=posicionX;
		this.posicionY=posicionY;
	}
	
	public void SetPosicionEnX(double valorX){
	   
	
		posicionX=valorX;
		
	}
	
	public void SetPosicionEnY(double valorY){
		   
		
		posicionY=valorY;
		
	}
	
	public double GetPosicionY(){
		
		
		return posicionY;
		
	}
	
	public double GetPosicionX(){
		
		
		return posicionX;
		
	}
	

@Override
public void mover(double incrementoX, double incrementoY) {
	
	posicionX+=incrementoX;
	posicionY+=incrementoY;
	
}	

public double calcularDistanciaDesde(Punto parametros) {
double cateto1 = posicionX - parametros.GetPosicionX();
double cateto2 = posicionY - parametros.GetPosicionY();
double hipotenusa = Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
return hipotenusa;
 
}

 }
