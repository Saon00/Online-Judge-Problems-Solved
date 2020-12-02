import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	
	public static boolean isAnagram(String a, String b) {
		char[] x = a.toCharArray();
		char[] y = b.toCharArray();
		Arrays.sort(x);
		Arrays.sort(y);
		
		if(Arrays.equals(x, y)==true)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        String a = scan.next().toLowerCase();
        String b = scan.next().toLowerCase();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
		
	}
}


// you can use this logic too ------

if (a.length() != b.length()) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        int sum = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            for (int i=0; i<a.length(); i++) {
                if (a.charAt(i) == c) {
                    sum++;
                }
                if (b.charAt(i) == c) {
                    sum--;
                }
            }
            if (sum != 0) {
                return false;
            }
        }
        return true;
