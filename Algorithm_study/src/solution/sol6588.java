package solution;
import java.util.ArrayList;
import java.util.Scanner;

public class sol6588 {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(true) {
			int a = sc.nextInt();
			if(a != 0 && a>= 6 && a <= 1000000) {
				list.add(a);
			}else {
				break;
			}
		}
		
		for(int i=0; i<list.size();i++) {
			boolean index = false;
			for(int z=3; z<list.get(i)-1;z++) {
				if(prime(z)) {
					if(prime(list.get(i)-z)) { 
						index = true;
						System.out.println(list.get(i)+" = "+z+" + "+(list.get(i)-z));
						break;
					}
				}
				
					
			}
			if(!index) System.out.println("Goldbach's conjecture is wrong.");
			
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
