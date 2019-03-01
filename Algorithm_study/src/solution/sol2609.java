package solution;
import java.util.Scanner;

public class sol2609 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println(gcd(a,b));
		System.out.println(lcm(a,b));
		
	}
	
	static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}else {
			return gcd(b, a%b);
		}
	}
	
	static int lcm(int a, int b) {
		int gcd = gcd(a,b);
		
		return gcd * (a/gcd) *(b/gcd);
	}
		

		
	

}
