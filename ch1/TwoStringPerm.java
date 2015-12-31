import java.util.Random;
public class TwoStringPerm{
	private Random ran = new Random(123);
	public void qSort(char[] input, int start, int end){
		if(start >= end) return;

		int m = partition(input, start, end);
		qSort(input, start, m-1);
		qSort(input, m+1, end);
	}  
	private int partition(char[] input, int start, int end){
		int m = ran.nextInt(end-start)+start;
		char tmp = input[m];
		input[m] = input[start];
		input[start] = tmp;

		int p = start, q = end;
		char mch = input[m];
		while(p< q){
			while(input[p]<=mch){
				p++;
			}
			while(input[q] > mch){
				q--;
			}
			//exchange
			tmp = input[p];
			input[p] = input[q];
			input[q] = tmp;
		}
		tmp = input[p];
		input[p] = input[q];
		input[q] = tmp;
		tmp = input[q];
		input[q] = input[start];
		input[start] = tmp;
		return q;

	}

	
	public boolean solution(String s1, String s2){
		if(s1.length() != s2.length())return false;
		char[] cs1 = s1.toCharArray();
		char[] cs2 = s2.toCharArray();

		qSort(cs1, 0, cs1.length-1);
		qSort(cs2, 0, cs2.length-1);

		boolean result = true;
		for(int i = 0; result && i< s1.length(); i++){
			if(cs1[i] != cs2[i]){
				result = false;
			}
		}
		return result;
	}


	public static void main(String[] args){

		String s1 = "linmeng";
		String s2 = "menglin";

		TwoStringPerm perm = new TwoStringPerm();

		if(perm.solution(s1, s2))
			System.out.println("true");
		else
			System.out.println("false");
	}

}
