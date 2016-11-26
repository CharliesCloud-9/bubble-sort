package bubbleSort;

public class BubbleSort {
	
	public int[] bubbleSort (int[] list) { 				//Public method that returns in int array “list”.
		int i, j, temp = 0;  							//i outer loop, j inner loop, temp to do the swaps.
		for (i = 0; i < list.length - 1; i++) { 		//Loops through 0 to length of list -1
			for (j = 0; j < list.length - 1 - i; j++) { //Runs from 0 to length of list -i (- number of items already sorted, which is the number of iterations we already completed, so i).
				if (list[j] > list[j + 1]) { 			//Inside j inner loop, each time through, going to do one comparison, going to compare an item (list[j]) to an item on its immediate right (list[j + 1])…
					temp = list[j]; 					//if the item to its left is greater than the item on its right, we swap the two items. This above is 1st part of swap…
					list[j] = list[j + 1]; 				//this is 2nd part of swap…
					list[j + 1] = temp; 				//this is 3rd,final part of swap in the inner loop.
				}
			}
		}
		return list;  									//In place sort, returning same list in sorted order
	}

	

}
