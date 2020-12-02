import java.util.*;
public class MainClass_1118 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> phbook = new HashMap<>();

		int limit = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < limit; i++) {
			String name = scan.next();
			int number = scan.nextInt();
			scan.nextLine();

			phbook.put(name, number);
		}

		while (scan.hasNext()) {
			try {

				String checkName = scan.nextLine();
				int result = phbook.get(checkName);
				System.out.println(checkName + "=" + result);
			} catch (Exception e) {
				System.out.println("Not Found");
			}
		}

	}
}
