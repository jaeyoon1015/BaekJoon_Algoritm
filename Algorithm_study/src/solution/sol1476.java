package solution;
import java.util.Scanner;

public class sol1476 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer[] years = new Integer[3];
		
		for(int i=0; i<years.length; i++) {
			years[i] = sc.nextInt();
		}
		
		Integer[] test = new Integer[3];
		for(int x=0; x<test.length; x++) {
			test[x] = 1; 
		}
		for(int i=1; ; i++) {
			if(test[0]==years[0] && test[1]==years[1] && test[2]==years[2]) {
				System.out.println(i);
				break;
			}
			for(int z=0; z<3; z++) {
				test[z] += 1;
			}
			if(test[0] == 16) {
				test[0] = 1;
			}
			if(test[1] == 29) {
				test[1] = 1;
			}
			if(test[2] == 20) {
				test[2] = 1;
			}
		}
		
	}

}
