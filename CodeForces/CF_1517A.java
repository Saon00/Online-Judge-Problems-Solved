import java.util.Scanner;

public class CF_1517A {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();

		while (testCase != 0) {

			long number = scan.nextLong();
			int result = 0;

			while (number >= 2050) {

				result++;
				long baseNumber = 2050;

				while (baseNumber <= number) {
					baseNumber = baseNumber * 10;
				}
				baseNumber = baseNumber / 10;
				number = number - baseNumber;

			}
			if (number != 0) {
				System.out.println(-1);
			} else {
				System.out.println(result);
			}
			testCase--;
		}

	}
}