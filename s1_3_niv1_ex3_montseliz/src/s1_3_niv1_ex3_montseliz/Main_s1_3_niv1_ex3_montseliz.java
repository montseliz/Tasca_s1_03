package s1_3_niv1_ex3_montseliz;

import java.util.*;

public class Main_s1_3_niv1_ex3_montseliz {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		FileWork filework = new FileWork(); 
		HashMap <String, String>  mapCountries = filework.readFile();
		System.out.println("Introdueix el teu nom: ");
		String name = input.nextLine(); 
		int points = randomKey(mapCountries); 
		filework.createFile(points, name);
		
		input.close();
	}	

	public static int randomKey(HashMap <String, String> mapCountries) {
		Scanner input = new Scanner (System.in);
		Random generator = new Random();
		int points = 0; 
		
		Object[] keys = mapCountries.keySet().toArray();
		
		for (int i = 0; i < 10; i++) {
			Object randomKey = keys[generator.nextInt(keys.length)];
			System.out.println("Introdueix la capital de " + randomKey + ":");
			String answer = input.nextLine();
			if (answer.equalsIgnoreCase(mapCountries.get(randomKey))) {
				points += 1; 
			} 
		}
		System.out.println("Has obtingut: " + points + " punts.");
		input.close();
		return points; 
	}

	
	
}
