package s1_3_niv1_ex2_montseliz;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main_s1_3_niv1_ex2_montseliz {

	public static void main(String[] args) {
		
		LinkedList <Integer> listNumbers = new LinkedList <Integer>(); 
		
		listNumbers.add(1);
		listNumbers.add(2);
		listNumbers.add(3);
		listNumbers.add(4);
		listNumbers.add(5);
		
		Iterator<Integer> it = listNumbers.iterator();
		while (it.hasNext()) {
			System.out.println(it.next()); 
		}  
		
		System.out.println(""); 
		
		LinkedList <Integer> listNumbersReverse = new LinkedList <Integer>();
		
		ListIterator<Integer> iterListNumbers = listNumbers.listIterator(); 
		
		
		while (iterListNumbers.hasNext()) {
			iterListNumbers.next();
		}
		
		while (iterListNumbers.hasPrevious()) {
			listNumbersReverse.add(iterListNumbers.previous());
			
		}	
		
		Iterator<Integer> itReverse = listNumbersReverse.iterator();
		while (itReverse.hasNext()) {
			System.out.println(itReverse.next()); 
		}
		
	}

}
