//import java.util.StringBuilder;
public class RunLengthCoding{
	public String coding(String input){
		int len = input.length();
		if(len<2) return input;
		StringBuilder result = new StringBuilder();

		int runLen = 0;
		char c = input.charAt(0);
		for(int i = 0; i < len; i++){
			if(input.charAt(i) == c){
				runLen++;
			}
			else{
				result.append(c);
				result.append(runLen);

				c = input.charAt(i);
				runLen = 1;
			}

		}
		result.append(c);
		result.append(runLen);
		return result.length() < len? result.toString():input;
	}

	public static void main(String[] args){
		String input = "aabcccccaaa";
		RunLengthCoding coder = new RunLengthCoding();
		System.out.println(coder.coding(input));
	}

}
