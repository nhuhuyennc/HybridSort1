package lab;

/**
 * Aufgabe H1c)
 * 
 * Abgabe von: <name>, <name> und <name>
 */

import java.util.ArrayList;
import frame.SortArray;

public class HybridOptimizer {

	/**
	 * Find the optimal value k of the HybridSort algorithm for
	 * the given data. Note that we assume that the first local minimum is
	 * the global minimum.
	 * @param testData Data on which the optimal k should be calculated
	 * @return the optimal k
	 */
	public static int optimize(ArrayList<Card> testData) {
		// TODO: implement
		
		HybridSort hybridSort = new HybridSort ();
		
		//begin with k = 0
		SortArray newSortArray = new SortArray (testData);
		int k = 0;
		hybridSort.sort(newSortArray, k);
		//Sum of read and writing-operation
		int Summe = newSortArray.getReadingOperations() + newSortArray.getWritingOperations();
		System.out.println (Summe);
		
		//find out k with loop
		for (k = 1; k < testData.size(); k++) {
			//create a new SortArray
			SortArray newOne = new SortArray (testData); 
			//sort with k
			hybridSort.sort(newOne, k);
			if (Summe < newOne.getReadingOperations() + newOne.getWritingOperations()) {
				return k-1;
			}
			k++;
			Summe = newOne.getReadingOperations() + newOne.getWritingOperations();
		}
		return k;
		
	}
}
