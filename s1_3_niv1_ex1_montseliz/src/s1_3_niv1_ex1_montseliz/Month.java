package s1_3_niv1_ex1_montseliz;

import java.util.Objects;

public class Month {

	private String name;  
	
	public Month(String name) {
		this.name = name; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Month other = (Month) obj;
		return Objects.equals(name, other.name);
	}

	public String toString() {
		return "Mes: " + this.name; 
	}

	

	
	
}
