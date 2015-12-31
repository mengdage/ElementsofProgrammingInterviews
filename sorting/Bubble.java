import java.util.Arrays;
public class Bubble{
	public int[] solution(int[] input){
		
		int times = 0;
		for(int i = input.length-1; i >0;i--){
		//Bubble from 0 to i
			boolean swap = false;
			for(int j = 0; j < i; j++){
			//compare j-th element with j+1-th element
			//swap if [j] > [j+1]

				//swap if [j] > [j+1]
				times++;
				if(input[j] > input[j+1]){
					input[j] = input[j] + input[j+1];
					input[j+1] = input[j]-input[j+1];
					input[j] = input[j]-input[j+1];
					swap = true;
				}


			}
			//if(!swap) break;
		}
		System.out.println("times: " + times);
		return input;
	}
	public int[] solution2(int[] input){
		boolean swap = true;
		int n = input.length-1;
		while(n>0){
			swap = false;

			int newn= 0;
			for(int i = 0; i < n; i++){
				if(input[i] > input[i+1]){
					int tmp = input[i];
					input[i]=input[i+1];
					input[i+1] = tmp;
					swap = true;
					newn=i;
				}
			}
			n=newn;

		}
		return input;

	}

	public static void main(String[] args){
		int[] ls1 = {0,10,8, 7,2,3,4, 10,13,24};
		int[] ls2 = {};
		int[] ls3 = {1,1};
		int[] ls4 = {1};
		Bubble bubble = new Bubble();
		System.out.println(Arrays.toString(bubble.solution2(ls1)));
		System.out.println(Arrays.toString(bubble.solution2(ls2)));
		System.out.println(Arrays.toString(bubble.solution2(ls3)));
		System.out.println(Arrays.toString(bubble.solution2(ls4)));

	}

}
