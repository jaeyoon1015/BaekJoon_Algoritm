package solution;
import java.util.Arrays;
import java.util.Scanner;

public class sol2309 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] input = new int[9];
		int result = 0;
		for(int i=0; i < input.length; i++) {
			input[i] = sc.nextInt();
			result += input[i];
		}
		Arrays.sort(input);
		for(int i=0; i<input.length; i++) {
			for(int j = i+1; j<input.length; j++) {
				if(result - input[i]-input[j] == 100) {
					for(int k=0; k<input.length; k++) {
						if(i == k || j == k) continue;
						System.out.println(input[k]);
					}
					
					System.exit(0);
				}
			}
		}
		
		
	}

}
