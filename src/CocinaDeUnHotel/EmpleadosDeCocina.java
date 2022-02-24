package CocinaDeUnHotel;

public class EmpleadosDeCocina {
	
	private int documento, dia,mes,anio;
	
	
	public EmpleadosDeCocina (int dni, int dia,
			int mes, int anio) {
		
		//validarParametros(dni,mes,dia,anio);
		this.documento=dni;
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
		
		
	}
	
	
	public String obtenerFechaDeIngreso() {
		
		return "Dia:\n"+this.dia + "\nMes:\n"+this.mes+"\nAno:\n"+this.anio;
	}
	
	
	public String obtenerAntiguedad (int dia,int mes,int anio) {
		
		int diaDeAntiguedad =0 +(dia-this.dia);
		int mesDeAntiguedad =0 + (mes-this.mes );
		int anioDeAntiguedad =0 + (anio-this.anio);
		
		return "Antiguedad dia:\n" + diaDeAntiguedad + "\nAntiguedad mes:\n" + mesDeAntiguedad +
				"\nAnio de antiguedad:\n" + anioDeAntiguedad ;
	}
	
	
	protected void validarParametros (int dia,int mes,
			int dni, int anio) {
		
		if((dni<=0)||(mes<=0 || mes>12)|| (mes ==2 && dia >29)||(dia<=0 || dia>31)) {
			throw new Error ("Parametros incorrectos");
		} 
	}


	public int getDocumento() {
		return documento;
	}
}
