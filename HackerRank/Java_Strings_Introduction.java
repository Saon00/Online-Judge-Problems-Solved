
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String A = scanner.nextLine();
		String B = scanner.nextLine();
		System.out.println((A+B).length());
        System.out.println(A.compareTo(B)>0?"Yes":"No");
		System.out.print(A.substring(0,1).toUpperCase()+A.substring(1));
		System.out.print(" "+B.substring(0,1).toUpperCase()+B.substring(1));
		
		
		
	}
}
