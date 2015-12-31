import java.util.Arrays;

public class Selection{
	public int[] solution(int[] input){
		int len = input.length;
		if(len==0 || len==1) return input;
		int min = input[0];
		int minpos = 0;
		
		for(int i = 0; i<len-1; i++){
		//in this loop place the minimum element in the i-th position
			min = input[i];
			minpos = i;
			for(int j = i; j <len; j++){
			//in this loop, find the minimum element

				if(input[j] < min){
					min = input[j];
					minpos = j;
				}

			}

			input[minpos] = input[i];
			input[i] = min;

		}
		return input;

	}

	public static void main(String[] args){
	int[] ls1 = {3,9, 1,2,3,13,30,20,4, 10,13,24};
	int[] ls2 = {};
	int[] ls3 = {1,1};
	int[] ls4 = {1};
	Selection select = new Selection();
	System.out.println(Arrays.toString(select.solution(ls1)));
	System.out.println(Arrays.toString(select.solution(ls2)));
	System.out.println(Arrays.toString(select.solution(ls3)));
	System.out.println(Arrays.toString(select.solution(ls4)));

	}
}
