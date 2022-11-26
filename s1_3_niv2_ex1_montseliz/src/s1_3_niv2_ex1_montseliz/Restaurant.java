package s1_3_niv2_ex1_montseliz;

import java.util.Objects;

public class Restaurant {

	private String name;
	private float value; 
	
	public Restaurant(String name, float value) {
		this.name = name; 
		this.value = value; 
	}
	
	public String getName() {
		return name; 
	}
	public float getValue() {
		return value; 
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	public void setValue(float value) {
		this.value = value; 
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		return Objects.equals(name, other.name)
				&& Float.floatToIntBits(value) == Float.floatToIntBits(other.value);
	}

	public String toString() {
		return "El nom del restaurant és: " + this.name + ".\n" 
				+ "La puntuació que té és: " + this.value + ".";
	}
}
