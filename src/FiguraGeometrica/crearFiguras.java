package FiguraGeometrica;

import jdk.internal.util.xml.impl.Input;

public class crearFiguras {
	private String tipoFiguras;
	private String[] parametros;

	public crearFiguras(String[] data) {

		this.tipoFiguras = data[0];
		this.parametros = data[1].split(",");

	}

	public Figuras inicializarFiguras() {

		Figuras unaFigura = null;

		try {

			if (this.tipoFiguras == "Circulo") {

				double radio, centroX, centroY;

				radio = Double.parseDouble(parametros[0]);
				centroX = Double.parseDouble(parametros[1]);
				centroY = Double.parseDouble(parametros[2]);

				unaFigura = new Circulo(radio, centroX, centroY);
			}
			if (this.tipoFiguras == "Cuadrado") {
				double verticeIzquierdoX, verticeIzquierdoY, lado;

				verticeIzquierdoX = Double.parseDouble(parametros[0]);
				verticeIzquierdoY = Double.parseDouble(parametros[1]);
				lado = Double.parseDouble(parametros[2]);

				unaFigura = new Cuadrado(verticeIzquierdoX, verticeIzquierdoY,
						lado);

			}

			if (this.tipoFiguras == "Rectangulo") {
				double verticeIzquierdoX, verticeIzquierdoY, base, altura;

				verticeIzquierdoX = Double.parseDouble(parametros[0]);
				verticeIzquierdoY = Double.parseDouble(parametros[1]);
				base = Double.parseDouble(parametros[2]);
				altura = Double.parseDouble(parametros[3]);
				unaFigura = new Rectangulo(verticeIzquierdoX,
						verticeIzquierdoY, base, altura);

			}
			if (this.tipoFiguras == "Elipse") {
				double semiEjeMayor, semiEjeMenor, centroX, centroY;

				semiEjeMayor = Double.parseDouble(parametros[0]);
				semiEjeMenor = Double.parseDouble(parametros[1]);
				centroX = Double.parseDouble(parametros[2]);
				centroY = Double.parseDouble(parametros[3]);
				unaFigura = new Elipse(semiEjeMayor, semiEjeMenor, centroX,
						centroY);

			}
			if (this.tipoFiguras == "Triangulo") {
				double verticeA_X, verticeA_Y, verticeB_X, verticeB_Y, verticeC_X, verticeC_Y;

				verticeA_X = Double.parseDouble(parametros[0]);
				verticeA_Y = Double.parseDouble(parametros[1]);
				verticeB_X = Double.parseDouble(parametros[2]);
				verticeB_Y = Double.parseDouble(parametros[3]);
				verticeC_X = Double.parseDouble(parametros[4]);
				verticeC_Y = Double.parseDouble(parametros[5]);
				

				unaFigura = new Triangulo(verticeA_X, verticeA_Y, verticeB_X,
						verticeB_Y,verticeC_X, verticeC_Y);

			}

			new Input().method();

		} catch (WrongParameters ex1) {

			System.out.println("Mensaje:" + ex1.getMessage());
		}

		return unaFigura;

	}
}
