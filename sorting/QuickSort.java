import java.util.Arrays;

public class QuickSort{
	private int[] input;
	private int len;

	public int[] sort(int[] input){
		this.input = input;
		len = input.length;
		doQuickSort(0, len-1);
		return input;
	}
	private void doQuickSort(int start, int end){
		if(start < end){
			int m = hpartition(start, end);
			doQuickSort(start, m);
			doQuickSort(m+1, end);
		}

	}

	//Hoare's version
	private int hpartition(int start, int end){
		int pivot = input[start];
		int i = start -1;
		int j = end + 1;
		while(true){
			do{
				j = j-1;

			}while(input[j]>pivot);
			do{
				i = i+1;
			}while(input[i] <pivot);
			if(i<j) {
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
			}
			else{
				return j;
			}
		}
	}
	//Lomuto's version
	private int partition(int start, int end){
		int p = start+1, q = start+1, pivot = start;
		int tmp;

		/*
		while(p<q){
			while(p <= end && input[p] <= input[m]){
				p++;
			}
			while(q >= start && input[q] > input[m]){
				q--;
			}
			//swap
			if(p<= end && q >= start){
				input[p] = input[p] + input[q];
				input[q] = input[p] - input[q];
				input[p] = input[p] - input[q];
				p++; q++;
			}
		}
		*/
		for(; q<=end; q++){
			if(input[q] <= input[pivot]){
				tmp = input[p];
				input[p] = input[q];
				input[q] = tmp;
				p++;
			}
		}
		tmp = input[p-1];
		input[p-1] = input[pivot];
		input[pivot] = tmp;
		return p-1;
	}
	
	public static void main(String[] args){

		int[] ls1 = {0, 1,2,3,4, 10,13,12, 24, 1,9, 3};
		int[] ls2 = {};
		int[] ls3 = {10, 1, 2, 3};
		int[] ls4 = {1};
		QuickSort qs = new QuickSort();
		System.out.println(Arrays.toString(qs.sort(ls1)));
		System.out.println(Arrays.toString(qs.sort(ls2)));
		System.out.println(Arrays.toString(qs.sort(ls3)));
		System.out.println(Arrays.toString(qs.sort(ls4)));

	}
	

}
