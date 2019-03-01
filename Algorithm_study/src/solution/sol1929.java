package solution;
import java.util.Scanner;

public class sol1929 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m= sc.nextInt();
		int n= sc.nextInt();
		
		int count = n-m+1;
		int array[] = new int[count];
		for(int i=0; i<count; i++) {
			array[i] = m;
			m++;
		}
		for(int z=0; z<count;z++) {
			if(prime(array[z])) {
				System.out.println(array[z]);
			}
		}
	}
	
	public static boolean prime(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2; i*i<=n; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	
}
