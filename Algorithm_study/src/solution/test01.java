package solution;
import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String str = "1";
		for(int i=0; i<number; i++) {
			String a=""; 
			int b=1;
			for(int j=0; j<str.length()-1; j++) {
				if(str.charAt(j) == str.charAt(j+1)) {
					a = String.valueOf(str.charAt(j));
					b += 1;
				}else {
					String str2 = String.valueOf(b);
					str = a+str2;
					a="";
					b=1;
				}
			}
		}
		System.out.println(str);
		
	}

}
