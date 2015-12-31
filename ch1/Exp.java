public class Exp{
	public double doExp(double x, int y){
		if(y==0) return 1;
		if(y<0){
			x = 1.0/x;
			y = -y;
		}
		if((y &1) ==1){
			return x*doExp(x, y/2) * doExp(x, y/2);

		}
		else{
			return doExp(x, y/2) * doExp(x, y/2);
		}

	}

	public static void main(String[] args){
		Exp exp = new Exp();

		System.out.println(exp.doExp(3,2));
		System.out.println(exp.doExp(3.2,3));
		System.out.println(exp.doExp(0,2));
		System.out.println(exp.doExp(3,0));
		System.out.println(exp.doExp(2,-2));
	}
}
