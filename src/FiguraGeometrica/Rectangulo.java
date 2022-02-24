package FiguraGeometrica;

public class Rectangulo extends Figuras{
	
	
protected double base=0;
protected double altura=0;
protected Punto inferiorIzquierdo;

	

	public Rectangulo(double verticeIzquierdoX,double verticeIzquierdoY,double base,double altura){
	
	this.base=base;
	this.altura=altura;
	inferiorIzquierdo=new Punto(verticeIzquierdoX,verticeIzquierdoY);
    validarLados(base,altura); 	
}
	
	public void validarLados(double valor1,double valor2){
		
		if(valor1!=valor2){
			
			System.out.println("Los vÈrtices ingresados construyen lados distintos");
		}
		
	    if(valor1==valor2){
	    	
	    	System.out.println("Los vÈrtices ingresados construyen lados iguales");
	    }
	}
	


@Override
public String nombreDeFigura()
{
	
	return "Rect·ngulo";
	
}


@Override
public double calcularArea()
{
	
	area= base*altura;		
	return area;
	
}
	
@Override
public void mover(double incrementoX, double incrementoY) {
	
	inferiorIzquierdo.mover(incrementoX,incrementoY);
	
}	
	
	
}
