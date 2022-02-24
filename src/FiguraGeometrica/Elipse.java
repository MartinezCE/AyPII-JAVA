package FiguraGeometrica;

public class Elipse extends Figuras{

	
protected double semiEjeMayor=0;
protected double semiEjeMenor=0;
protected Punto centro;


public Elipse(double semiEjeMenor,double semiEjeMayor,double centroX,double centroY){

	
	this.semiEjeMayor=semiEjeMayor;
	this.semiEjeMenor=semiEjeMenor;
	this.centro=new Punto(centroX,centroY);
		
}

@Override
public String nombreDeFigura()
{
	
	return "Elipse";
	
}


@Override
public double calcularArea()
{
		
	area= semiEjeMenor*semiEjeMayor*Math.PI;
		

	return area;
	
}



@Override
public void mover(double incrementoX, double incrementoY) {

	centro.mover(incrementoX, incrementoY);
		
}

	
	
}
