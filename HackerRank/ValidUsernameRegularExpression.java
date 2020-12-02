
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("^[a-zA-Z]\\w{7,29}$");

		int number = Integer.parseInt(in.nextLine());

		while (number-- > 0) {
			String name = in.nextLine();
			Matcher matcher = pattern.matcher(name);

			if (matcher.matches()) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}

		in.close();
	}

}
