package s1_3_niv1_ex1_montseliz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main_s1_3_niv1_ex1_montseliz {

	public static void main(String[] args) {
		
		System.out.println("Creo una ArrayList amb tots els mesos, excepte agost, i la recorro amb un for each:\n");
		
		ArrayList<Month> arrayMonths = new ArrayList<Month>();
		
		arrayMonths.add(new Month("Gener")); 
		arrayMonths.add(new Month("Febrer")); 
		arrayMonths.add(new Month("Març"));
		arrayMonths.add(new Month("Abril"));
		arrayMonths.add(new Month("Maig"));
		arrayMonths.add(new Month("Juny"));
		arrayMonths.add(new Month("Juliol"));
		arrayMonths.add(new Month("Setembre"));
		arrayMonths.add(new Month("Octubre"));
		arrayMonths.add(new Month("Novembre"));
		arrayMonths.add(new Month("Desembre"));

		for (Month months: arrayMonths) {
			System.out.println(months.toString()); 
		}
		
		System.out.println("\nCreo l'objecte agost, l'afegeixo a l'ArrayList, i la recorro amb un iterator:\n");

		arrayMonths.add(7, new Month("Agost")); 
		
		Iterator<Month> it = arrayMonths.iterator();
		while (it.hasNext()) {
			System.out.println(it.next()); 
		} 
		
		System.out.println("\nConverteixo l'ArrayList en un HashSet, comprovo que no admet duplicats i la recorro amb un for each:\n");
		
		Set<Month> hashsetMonths = new HashSet<Month>(arrayMonths); 
		
		hashsetMonths.add(new Month("Agost")); 
		hashsetMonths.add(new Month("Desembre"));  
		
		for (Month months: hashsetMonths) {
			System.out.println(months.toString()); 
		}
	}

}
