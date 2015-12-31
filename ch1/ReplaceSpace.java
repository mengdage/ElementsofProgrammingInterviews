public class ReplaceSpace{
	public String solution(String input, String mark){
		int mLen = mark.length();
		int iLen = input.length();

		char[] result = new char[iLen*mLen];
		int index = 0;

		for(int i = 0; i < iLen; i++){
			if(input.charAt(i) == ' '){
				for(int j = 0; j < mark.length(); j++)
					result[index++] = mark.charAt(j);
			}
			else{
				result[index++] = input.charAt(i);
			}
		}
		return new String(result, 0, index-1);
	}

	public static void main(String[] args){
		ReplaceSpace rs = new ReplaceSpace();
		String result = rs.solution("lin meng", "123");
		System.out.println(result + " " +result.length());
	}
}
