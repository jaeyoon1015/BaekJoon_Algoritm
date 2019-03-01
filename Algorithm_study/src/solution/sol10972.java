package solution;

import java.util.Arrays;
import java.util.Scanner;

public class sol10972 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		Integer[] array = new Integer[count];
		for (int i = 0; i < count; i++) {
			array[i] = sc.nextInt();

		}

		int index = 0;
		for (int j = 1; j < count; j++) {
			if (array[j - 1] < array[j]) {
				index = j - 1;
			} else {
				index = -1;
			}
		}
		if (index < 0) {
			System.out.println(index);
		} else {
			int min = index + 1;
			for (int z = index + 2; z < count; z++) {
				if ((array[min] > array[z]) && (array[z] > array[index])) {
					min = z;
				}
			}

			int temp = array[min];
			array[min] = array[index];
			array[index] = temp;

			Arrays.sort(array, index + 1, array.length);

			for (int i = 0; i < count; i++) {

				System.out.print(array[i] + "  ");
			}
		}
	}

}
