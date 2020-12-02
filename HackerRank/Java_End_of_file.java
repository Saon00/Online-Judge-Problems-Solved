import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// for Loop
		for (int i = 1; scan.hasNext() == true; i++) {
			System.out.println(i + " " + scan.nextLine());
		}

		// While Loop
		int j = 1;
		while (scan.hasNext()) {
			System.out.println(j + " " + scan.nextLine());
			j++;
		}

	}
}
