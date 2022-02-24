
public class Persona {
	
	protected String name;
	protected float age;
	
	Persona (String name, float age){
		
		this.name = name;
		this.age = age;
	}
	
	public int getAge () {
		return (int) this.age;
	}
	
	public String getName () {
		return this.name;
	}
	
	public boolean equals(Persona p) {
		if(this == p) {
			return true;
		}return false;
	}
}
