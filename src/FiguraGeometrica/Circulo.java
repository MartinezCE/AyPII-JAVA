package FiguraGeometrica;

public class Circulo extends Elipse {



public Circulo(double radio,double centroX,double centroY) {
		super(centroX,centroY,radio,radio);
			
	}
	

@Override
public String nombreDeFigura()
{
	
	return "Circulo";
	
}


@Override
public double calcularArea()
{
	area= Math.PI * Math.pow(semiEjeMenor, 2);
	return area;
	
}
	
@Override
public void mover(double incrementoX, double incrementoY) {
	
   centro.mover(incrementoX, incrementoY);
   	
	
}

	
	
	
}
