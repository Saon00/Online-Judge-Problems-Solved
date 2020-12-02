import java.util.Scanner;
public class MainClass_1026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	    long x, y, ans;  
	  while (sc.hasNext()) {  
	        x = sc.nextLong(); 
	        y = sc.nextLong(); 
	        ans = x^y; 
	        System.out.println(ans); 
	}

	}
}
