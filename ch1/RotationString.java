public class RotationString{
	public boolean isSubstring(String s1, String s2){
	//check if s2 is a rotation of s1
		int len1 = s1.length();
		int len2 = s2.length();

		//if one of the strings is empty, return true only if both of them are empty.
		if(len1 * len2 == 0) return len1==0 && len2 == 0;

		boolean isSub = false;
		for(int iS2=0; !isSub && iS2 < len2; iS2++){
			if(s2.charAt(iS2) == s1.charAt(0)){
				boolean ifmatch = true;
				int kS2 = (iS2+1)%len2;
				for(int jS1=(0+1)%len1; ifmatch && jS1 !=0 ; jS1=(jS1+1)%len1){
					if(s1.charAt(jS1) != s2.charAt(kS2)){
						ifmatch = false;
					}
					kS2 = (kS2+1)%len2;
				}
				isSub = ifmatch;

			}
		}
		return isSub;
	}

	public static void main(String[] args){
		String s1, s2;
		if(args.length != 2){
			s1 = "waterbottle";
			s2 = "erbottlewat";
		}
		else{
			s1 = args[0];
			s2 = args[1];
		}
		RotationString rs = new RotationString();
		if(rs.isSubstring(s1, s2)){
			System.out.println(s2+ " is a rotation of " + s1);
		}
		else{
			System.out.println(s2+ " is not a rotation of " + s1);

		}
	}
}
