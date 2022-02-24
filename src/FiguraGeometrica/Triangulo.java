package FiguraGeometrica;

public class Triangulo extends Figuras {
	private double lado1=0;
	private double lado2=0;
	private double lado3=0;
	private Punto verticeA;
	private Punto verticeB;
	private Punto verticeC;

	public Triangulo(double verticeAvariableX,double verticeAvariableY,double verticeBvariableX,double verticeBvariableY,double verticeCvariableX,double verticeCvariableY) {
		
		
		if (validarDistanciaEntre(verticeAvariableX,verticeAvariableY,verticeBvariableX,verticeBvariableY,verticeCvariableX,verticeCvariableY)&&
		validarColinealidad(verticeAvariableX,verticeAvariableY,verticeBvariableX,verticeBvariableY,verticeCvariableX,verticeCvariableY)) {

			System.out.println("Los vertices estan bien ingresados");

		} 
		
		else 
		{
			
			throw new Error("Los vertices deben ser menores a 500");
		}

	}


	private boolean validarColinealidad(double verticeAvariableX,
			double verticeAvariableY, double verticeBvariableX,
			double verticeBvariableY, double verticeCvariableX,
			double verticeCvariableY) {
		boolean esValido=false;
		
		if((verticeAvariableX==verticeBvariableX&&verticeBvariableX==verticeCvariableX&&verticeAvariableX==verticeCvariableX)||
		(verticeAvariableY==verticeBvariableY&&verticeBvariableY==verticeCvariableY&&verticeAvariableY==verticeCvariableY)){
			
			esValido=true;
		}
		
		
		return esValido;
	}


	@Override
	public String nombreDeFigura() {

		return "Triangulo";

	}

     	@Override	
     	public double calcularArea() {

		double perimeto = (lado1 + lado2 + lado3) / 2;

		double area = Math.sqrt(perimeto * (perimeto - lado1)
				* (perimeto - lado2) * (perimeto - lado3));

		return area;
	}


     	@Override
     	public void mover(double incrementoX, double incrementoY) {

		verticeA.mover(incrementoX, incrementoY);
		verticeB.mover(incrementoX, incrementoY);
		verticeC.mover(incrementoX, incrementoY);

	}
	
		public boolean validarDistanciaEntre(double verticeAvariableX,double verticeAvariableY,double verticeBvariableX,double verticeBvariableY,double verticeCvariableX,double verticeCvariableY) {

		boolean esValido = false;
		
		verticeA=new Punto(verticeAvariableX,verticeAvariableY);
		verticeB=new Punto(verticeBvariableX,verticeBvariableY);
		verticeC=new Punto(verticeCvariableX,verticeCvariableY);
		

		lado1 = verticeA.calcularDistanciaDesde(verticeB);
		lado2 = verticeA.calcularDistanciaDesde(verticeC);
		lado3 = verticeB.calcularDistanciaDesde(verticeC);

		if (lado1 < 500 && lado2 < 500 && lado3 < 500) {
		
		esValido = true;
		}

		return esValido;
	}

}
