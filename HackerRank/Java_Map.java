import java.util.HashMap;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		HashMap<String, Integer> items = new HashMap<>();
		String name;
		int number;
		int limit = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < limit; i++) {
			name = scanner.nextLine();
			number = scanner.nextInt();
			scanner.nextLine();
			items.put(name, number);
		}
		
		while(scanner.hasNext()) {
			String check = scanner.nextLine();
			try {
				System.out.println(check+"="+items.get(check));
			}
			catch (Exception e) {
				System.out.println("Not Found");
			}
		}
		
//		String check;
//		while ((check = scanner.nextLine()) != null) {
//			if (items.containsKey(check)) {
//				System.out.println(check + "=" + items.get(check));
//			} else {
//				System.out.println("Not Found");
//			}
//		}

	}
}
