import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();
		int limit = scanner.nextInt();
		for (int i = 0; i < limit; i++) {

			list.add(scanner.nextInt());
		}
		int query = scanner.nextInt();
		scanner.nextLine();
		for (int j = 0; j < query; j++) {
			String command = scanner.nextLine().toLowerCase();
			if (command.equals("insert")) {
				int index = scanner.nextInt();
				int element = scanner.nextInt();
				scanner.nextLine();
				list.add(index, element);
			} else {
				list.remove(scanner.nextInt());
			}
		}

		for (int result : list)
			System.out.print(result + " ");

	}
}
