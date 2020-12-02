
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String A = scanner.nextLine();
		System.out.println(A.equals(new StringBuilder(A).reverse().toString()) ? "Yes" : "No");

	}
}
