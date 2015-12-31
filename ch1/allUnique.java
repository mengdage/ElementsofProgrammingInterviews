import java.util.HashSet;

public class allUnique{
	String seq;
	public allUnique(String s){
		seq = s.toLowerCase();

	}
	public boolean ifAllUniqueHS(){
		if(seq == null) return false;
		HashSet<Character> alphabet = new HashSet<Character>();
		int len = seq.length();
		char c;
		for(int i = 0; i<len; i++){
			c = seq.charAt(i);
			if(c >='A' && c<='z'){
				alphabet.add(c);
			}
		}
		if(alphabet.size() == 26) {
			return true;
		}
		else{
			System.out.println(alphabet.size());
			return false;
		}

	}
	public boolean ifAllUnique(){
		int len = seq.length();
		int[] alphabet = new int[26];
		for(int i = 0; i < 26; i++){
			alphabet[i] = 0;
		}
		char c;
		for(int i = 0; i < len; i++){
			c = seq.charAt(i);
			if(c-'a'>=0 && c-'a'<=25)
				alphabet[c-'a'] = 1;
		}
		boolean result = true;
		for(int i = 0; result && i < 26; i++){
			if(alphabet[i] != 1)
				result = false;
		}
		return result;


	}

	public static void main(String[] args){
		String name;
		if(args.length<1){
			name = "abcdefghijklmnopqrstuvwxyz";
		}
		else{
			name = args[0];
		}

		System.out.println("The input is: " + name);
		allUnique unique = new allUnique(name);
		if(unique.ifAllUnique()){
			System.out.println("true");
		}
		else{
			System.out.println("fasle");
		}
	}


}
