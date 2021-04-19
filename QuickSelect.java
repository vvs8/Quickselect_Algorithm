import java.util.*;

public class QuickSelect {

	public int findKthSmallest(int[] A, int k) {
		int result_index = quickSelect(A, 0, A.length-1, A.length-k);
	  	return A[result_index];
  	}

	public int quickSelect(int A[], int low, int high, int k) {
		int partition_index = partition(A, low, high);
		if(partition_index == k) 
      			return partition_index;
	  	else if (partition_index > k) 
      			return quickSelect(A, low, partition_index-1, k);
	  	else 
      			return quickSelect(A, partition_index+1, high, k);
  	}

  	public int partition(int A[], int low, int high) {
		int random_index = (int) (low + (Math.random()*(high-low+1)));
	  	swap(A, high, random_index);
		int pivot = A[high];
	  	int index = low;
	  	for(int i = low ; i < high ; i++){
	  		if(A[i] >= pivot){
		  		swap(A, i, index);
		  		index++;
	  		}
  		}
	 	swap(A, index, high);
	  	return index;
  	}

  	public void swap(int A[], int i , int j) {
		int temp = A[i];
	  	A[i] = A[j];
	  	A[j] = temp;
  	}



}
