
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String line = scanner.nextLine();
		int start = scanner.nextInt();
		int end = scanner.nextInt();

		System.out.println(line.substring(start, end));
	}
}
