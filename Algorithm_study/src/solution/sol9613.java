package solution;
import java.util.Scanner;

public class sol9613 {   // �˰��� �����ߴ� ������! ��� ��Ÿ�� �������� !

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		while(count-- > 0) {  // while�ᵵ �ǰ� for�� �ᵵ �ȴ�. Scanner ���� ȣ��� result�� int������ �� �� �߸��̴�. 
			
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
