package solution;
import java.util.Scanner;

public class sol1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		
		int count = sc.nextInt();
		int array[] = new int[count];
		for(int z=0; z<count; z++) {
			array[z]=sc.nextInt();
		}
		for(int j=0; j<count; j++) {
			if(prime(array[j])) {
				result += 1;
			}
		}
		
		System.out.println(result);

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
