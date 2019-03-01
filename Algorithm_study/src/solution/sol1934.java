package solution;
import java.util.Scanner;

public class sol1934 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		while(count-- > 0) {
			lcm();
		}
		
	}
	
	static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}else {
			return gcd(b, a%b);
		}
	}
	
	
	static void lcm() {

		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int gcd = gcd(a,b);
		System.out.println(a *(b/gcd));
	}

}
