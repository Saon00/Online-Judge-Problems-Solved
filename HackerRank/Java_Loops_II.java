// Happy

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		for (int j = 0; j < limit; j++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			int sum = 0, initial_result, final_result;
			for (int i = 0; i < n; i++) {
				initial_result = (int) (a + Math.pow(2, i) * b);
				final_result = initial_result + sum;
				System.out.print(final_result + " ");
				sum = final_result - a;
			}
			System.out.println();
		}
	}

}
