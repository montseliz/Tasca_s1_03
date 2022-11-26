package s1_3_niv2_ex1_montseliz;

import java.util.HashSet;
import java.util.Iterator;

public class Main_s1_3_niv2_ex1_montseliz {

	public static void main(String[] args) {
		
		HashSet<Restaurant> setRestaurants = new HashSet<Restaurant>();
		
		setRestaurants.add(new Restaurant("7 Portes", 9.6f)); 
		setRestaurants.add(new Restaurant("El Xampanyet", 8.4f)); 
		setRestaurants.add(new Restaurant("Can Cortada", 8.8f)); 
		setRestaurants.add(new Restaurant("El Nacional BCN", 7.5f)); 
		setRestaurants.add(new Restaurant("Mont Bar", 6.8f)); 
		
		for (Restaurant restaurant : setRestaurants) {
			System.out.println(restaurant.toString()); 
		}
		
		System.out.println("\nCreem dos nous objectes Restaurant amb els mateixos valors de name i value "
				+ "que dos altres objectes ja creats, i no ens permet duplicar-los:\n");
		
		setRestaurants.add(new Restaurant("Mont Bar", 6.8f));
		setRestaurants.add(new Restaurant("El Xampanyet", 8.4f));
		
		Iterator<Restaurant> it = setRestaurants.iterator();
		while (it.hasNext()) {
			System.out.println(it.next()); 
		} 
		
		System.out.println("\nCreem un objecte Restaurant amb el mateix valor de name i diferent value i se'ns afegeix al HashSet:\n");

		setRestaurants.add(new Restaurant("El Xampanyet", 7.3f));
		
		Iterator<Restaurant> it2 = setRestaurants.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next()); 
		} 
		
	}

}
