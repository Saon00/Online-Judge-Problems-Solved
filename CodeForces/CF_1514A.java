
import java.util.Scanner;

public class CF_1514A {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int testCase = scan.nextInt();

		while (testCase != 0) {

			int arrayLimit = scan.nextInt();
			boolean result = false;
			int[] arrayNumbers = new int[arrayLimit];
			for (int i = 0; i < arrayLimit; i++) {
				arrayNumbers[i] = scan.nextInt();
				int value = (int) Math.sqrt(arrayNumbers[i]);
				if(value*value != arrayNumbers[i]) {
					result = true;
				}
			
			}
			
			System.out.println((result) ? "Yes" : "No");

			testCase--;
		}

	}
}
