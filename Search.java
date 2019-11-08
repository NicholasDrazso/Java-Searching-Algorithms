//Name: Nicholas Drazso
//Date: April 1, 2019
//Program Description: Recursive implementation of binary search
public class Search {
	
	public static int binarySearch(int [] A, int key, int lo, int hi) {

		//Creates middle index
		int mid = (hi + lo)/2;
		
		//Cases that would break the program
		if (A == null || lo > hi || hi > A.length - 1) {
			
			return -1;
		}
		
		//Otherwise recur
		else {
			//Best case the middle index is the key, return the index
			if (A[mid] == key) {
				return mid;
			}
			
			//If the key is greater than the middle index, recall binarySearch with a new lower bound
			else if (A[mid] < key) {
				return binarySearch(A, key, mid + 1, hi);
			}
			
			//If the key is less than the middle index, recall binarySearch with a new upper bound
			else {
				return binarySearch(A, key, lo, mid - 1);
			}
			
		}
		
	}

}
