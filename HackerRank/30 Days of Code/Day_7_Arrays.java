import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int limit = scanner.nextInt();
		scanner.nextLine();
		int[] arr = new int[limit];

		String[] numberString = scanner.nextLine().split(" ");

		for (int i = limit - 1; i >= 0; i--) {

			int result = Integer.parseInt(numberString[i]);
			System.out.print(result + " ");

		}
	}

}


//  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
