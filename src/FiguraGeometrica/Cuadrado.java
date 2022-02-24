package FiguraGeometrica;

public class Cuadrado extends Rectangulo {
	

public Cuadrado(double verticeIzquierdoX,double verticeIzquierdoY,double lado){
super(verticeIzquierdoX,verticeIzquierdoY,lado,lado);

}

@Override
public String nombreDeFigura()
{
	
	return "Cuadrado";
	
}


@Override
public double calcularArea()
{
	
    area= Math.pow(base, 2);
	return area;
	
}

@Override
public void mover(double incrementoX, double incrementoY) {
	
	inferiorIzquierdo.mover(incrementoX,incrementoY);
	
}
	
		
}
