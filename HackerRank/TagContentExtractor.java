// to know better check this: https://www.hackerrank.com/challenges/tag-content-extractor/forum

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MainClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int testCase = Integer.parseInt(scanner.nextLine());
		
		while(testCase-- > 0) {
			String line = scanner.nextLine();
			
			boolean matchFound = false;
			Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
			Matcher matcher = pattern.matcher(line);
			
			while(matcher.find()) {
				System.out.println(matcher.group(2));
				matchFound = true;				
			}
			if(!matchFound) {
				System.out.println("None");
			}
		}

	}

}
