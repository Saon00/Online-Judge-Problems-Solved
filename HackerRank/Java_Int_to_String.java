import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		String numString = Integer.toString(num);

		if (num == Integer.parseInt(numString))
			System.out.println("Good job");
		else
			System.out.println("Wrong answer");

	}
}
