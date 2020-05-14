package lab;

/**
 * Aufgabe H1d)
 * 
 * Abgabe von: <name>, <name> und <name>
 */

import java.util.Random;

/**
 * Use a random pivot within Quick Sort.
 */
public class HybridSortRandomPivot extends HybridSort {
	// TODO: Implement 
	
	
	private Random random;
	
	//Constructor 
	public HybridSortRandomPivot () {
		random = new Random ();
	}
	// choose a random pivot in bound p und n
	
	public int Pivot (int p, int n) {
		return random.nextInt(n-p) + p;
	}


}
