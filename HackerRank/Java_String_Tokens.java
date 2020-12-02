
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		ArrayList<String> name = new ArrayList<>();
		int count=0;
		for(String newLine : line.split("[ !,?'._@]+")) {
			name.add(newLine);
			count++;
		}
		System.out.println(count);
		for(String result : name) {
			System.out.println(result);
		}
		
	}
}

// for all test case 
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	scan.useDelimiter("\\Z");
	String s = scan.next().trim();
	if (s.length() > 0) {
		String[] tokens = s.split("[!,?._'@\\s]+");
		System.out.println(tokens.length);
		for(String token : tokens) {
			System.out.println(token);
		}
	} else {
		System.out.println(0);
	}
	scan.close();
}
