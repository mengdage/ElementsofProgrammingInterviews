public class Multiplication{
	public String multiply(String num1, String num2){
		int len1 = num1.length(), len2 = num2.length();

		int[] product = new int[len1+len2];
		for(int i = 0; i < len1+len2; i++){
			product[i]=0;
		}

		for(int i = 0; i< len1; i++){
			for(int j = 0; j<len2; j++){
				product[i+j] += (num1.charAt(len1-1-i)-'0') * (num2.charAt(len2-1-j)-'0');
				product[i+j+1] += product[i+j]/10;
				product[i+j] = product[i+j]%10;
			}
		}

		StringBuilder result = new StringBuilder();
		int pzero = len1+len2-1;
		while(pzero>0 && product[pzero]==0){
			pzero--;
		}

		while(pzero>=0){
			result.append(product[pzero]);
			pzero--;
		}

		return result.toString();

	}


	public static void main(String[] args){
		String num1 = "1234";
		String num2 = "123";
		if(args.length >= 2){
			num1 = args[0];
			num2 = args[1];
		}

		Multiplication multiplier = new Multiplication();
		System.out.println(multiplier.multiply(num1, num2));
	}
}
