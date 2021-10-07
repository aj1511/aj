
public class tp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(fact(5));
	}
	
	static int fact(int a) {
		
		if (a==0)
			return 1;
		else
			return a*fact(a-1);
	}

}
