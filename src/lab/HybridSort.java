package lab;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

/**
 * Aufgabe H1b)
 * 
 * Abgabe von: <name>, <name> und <name>
 */

import frame.SortArray;

public class HybridSort {
	
	/**
	 * Sort the given array using a hybrid method of Quick Sort and Insertion Sort.
	 * 
	 * @param array The array to sort.
	 * @param k Parameter k when we switch from Quick Sort to Insertion Sort: If the size of the subset which should be sorted is less than k, use Insertion Sort,
	 * 			otherwise keep on using Quick Sort.
	 */

	

	public void sort(SortArray array, int k) {
		assert(k>=0);
		// TODO: Implement
		
		QuickSort (array, 0, array.getNumberOfItems()-1, k);
		
	}
		
	/**
	 * Insertion Sort
	 * 
	 * @param array The array to sort. 
	 * @param p Beginning Index
	 * @param n Ending Index
	 * 
	 */

	
public void InsertionSort (SortArray array, int p, int n) {
	for (int i = p + 1; i <= n; i++) {
		Card key = array.getElementAt(i);
		int j = i-1 ;
		while (j >= p && array.getElementAt(j).compareTo(key) == 1) {
			array.setElementAt(j+1, array.getElementAt(j));
			j = j-1;
		}
		array.setElementAt(j+1, key);
	}
	
}
/**
 * Pivot method define a pivot at Beginning Index
 * 
 * @param p Beginning Index
 * @param n Ending Index
 * 
 */

public int Pivot (int p, int n) {
	return p;
}

/**
 * swap two Elements of array
 * 
 * @param array The imputed array . 
 * @param a Index of 1. Element
 * @param b Index of 2. Element
 * 
 */


public void swap (SortArray array, int a, int b) {
	if (a != b) {
		Card temp = array.getElementAt(a);
		array.setElementAt(a, array.getElementAt(b));
		array.setElementAt(b, temp);
	}
	else {
		return;
	}
}

/**
 * Find out Partition of Array
 * 
 * @param array The array to find out Partiton. 
 * @param p Beginning Index
 * @param n Ending Index
 * 
 */

public int Partition (SortArray array, int p, int n) {
	
	int pivotIndex = Pivot (p,n);
	Card pivot = array.getElementAt(pivotIndex);
	swap (array, pivotIndex, p);
	
	int i = p;
	for (int j = p; j <= n; j++) {
		if (array.getElementAt(j).compareTo(pivot) < 0) {
			i++;
			swap (array, i, j);
		}
	}
	swap (array, i, p);
	return i;
}

/**
 * Quick Sort
 * 
 * @param array The array to sort.
 * @param p Beginning Index
 * @param n Ending Index
 * @param k Parameter k when we switch from Quick Sort to Insertion Sort: If the size of the subset which should be sorted is less than k, use Insertion Sort,
 * 			otherwise keep on using Quick Sort.
 */

public void QuickSort (SortArray array, int p, int n, int k) {
	if (p < n) {
		if (n-p < k) {
			InsertionSort (array, p, n);
		}
		else {
			int partition = Partition (array, p, n);
			QuickSort (array, p, partition-1, k);
			QuickSort (array, partition+1, n, k);
		}
	}
	else 
		return;
}

	
}
