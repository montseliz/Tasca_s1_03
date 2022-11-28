package s1_3_niv1_ex3_montseliz;

import java.io.*;
import java.util.*;

public class Main_s1_3_niv1_ex3_montseliz {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		HashMap <String, String>  mapCountries = readFile();
		System.out.println("Introdueix el teu nom: ");
		String name = input.nextLine(); 
		int points = randomKey(mapCountries); 
		createFile(points, name);
		
		input.close();
	}	

	public static HashMap <String, String> readFile() { 
		HashMap <String, String>  mapCountries = new HashMap <String, String>(); 
		FileReader fr = null; 
		BufferedReader br = null; 
		String line = "";
		
		try {
			fr = new FileReader("src\\countries.txt");
			br = new BufferedReader(fr);
			while ((line = br.readLine()) != null) {
				//System.out.println(line); 
				String[] textSTR = line.split(" "); 
				mapCountries.put(textSTR[0], textSTR[1]); 
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Fitxer no trobat.");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error d'entrada/sortida."); 
		} finally {
			try {
				if(null != fr) {
					fr.close(); 
					br.close();
				}
			} catch (Exception e) {
				e.printStackTrace(); 
			}
		}
		return mapCountries;
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

	public static void createFile(int points, String name) {
		File file = new File("src\\classificacio.txt"); 
		FileWriter fw = null; 
		BufferedWriter bw = null; 
		
		try {
			fw = new FileWriter (file, true); 
			/*if (!file.exists()) {
				file.createNewFile(); 
			} */ 
			bw = new BufferedWriter (fw); 
			bw.write("Nom: " + name + "\nPunts: " + points); 
			System.out.println("Arxiu guardat correctament.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(null != fw) {
					fw.close();
					bw.close();
				}
			} catch (Exception e) {
				e.printStackTrace(); 
			}
		}
	}
	
}
