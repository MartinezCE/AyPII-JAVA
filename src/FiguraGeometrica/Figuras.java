package FiguraGeometrica;

public abstract class Figuras implements Comparable, MoverFigura {
	
	
protected double area;
	
@Override
public int compareTo(Figuras nuevaFigura){
	
	if(this.calcularArea() > nuevaFigura.calcularArea()){
		return 1;
	}
	else if(this.calcularArea() < nuevaFigura.calcularArea()){
		return -1;
	}
	else return 0;
}


public abstract String nombreDeFigura();	

public abstract double calcularArea();
	

}
