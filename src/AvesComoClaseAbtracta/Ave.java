package AvesComoClaseAbtracta;

public abstract class Ave {
	
	String color;
	
	public void setColor (String color) {
		
		this.color=color;
	}
	
	public String getColor () {
		return color;
	}
	
	public abstract String mover();
	

}
