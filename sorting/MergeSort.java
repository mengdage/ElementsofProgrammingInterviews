import java.util.Arrays;
public class MergeSort{
	private int[] temp;
	private int[] input;
	private int length;

	public void sort(int[] input){
		this.input = input;
		length = input.length;
		temp = new int[length];

		doMergeSort(0, length-1);

	}

	private void doMergeSort(int start, int end){
		//!!! in case zero or one element in the array.
		if(start >= end) return;
		int mid = start+(end-start)/2;
		doMergeSort(start, mid);
		doMergeSort(mid+1, end);
		merge(start, mid, end);
	}
	private void merge(int start, int mid, int end){
		int i = start, j = mid+1, k=start;
		while(i<=mid && j<=end){
			if(input[i] < input[j]){
				temp[k] = input[i];
				k++; i++;
			}
			else{
				temp[k] = input[j];
				k++; j++;
			}
		}

		while(i<= mid){
			temp[k++] = input[i++];
		}
		//!!! if put input into temp first, we don't need to put the rest of j part back
		while(j<= end){
			temp[k++] = input[j++];
		}

		for(int m = start; m <= end; m++){
			input[m] = temp[m];
		}
		
	}

	public static void main(String args[]){
		//int[] arr = {1,3,2,5,10, 9, 7, 6, 2, 2, 2,1 };
		int[] arr = {};
		MergeSort ms = new MergeSort();
		ms.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
