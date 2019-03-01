package solution;
import java.util.Scanner;

public class sol9613 {   // 알고리즘 질문했던 문제임! 계속 런타임 오류나서 !

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		while(count-- > 0) {  // while써도 되고 for문 써도 된다. Scanner 다중 호출과 result를 int형으로 한 게 잘못이다. 
			
			System.out.println(sumGcd(sc));
			
		}
		
	}
	public static int sumGcd(Scanner sc) {
		
		int a = sc.nextInt();
		
		int[] abc = new int[a];
		int result=0;
		
		for(int i=0; i<a; i++) {
			abc[i] = sc.nextInt();
		}
		
		for(int i=0; i< abc.length -1 ; i++) {
			for(int z=i+1; z<abc.length; z++) {
				result += gcd(abc[i],abc[z]);
			}
		}
		return result;
		
	}
	
	static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}else {
			return gcd(b, a%b);
		}
	}

}
