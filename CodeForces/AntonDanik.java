import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        if (s.chars().filter(ch -> ch == 'A').count() > s.chars().filter(ch -> ch == 'D').count())
            System.out.println("Anton");
        if (s.chars().filter(ch -> ch == 'A').count() < s.chars().filter(ch -> ch == 'D').count())
            System.out.println("Danik");
        if (s.chars().filter(ch -> ch == 'A').count() == s.chars().filter(ch -> ch == 'D').count())
            System.out.println("Friendship");
    }
}

// https://codeforces.com/problemset/problem/734/A

/* another way:

public static void main(String[] args) {
    		Scanner in = new Scanner(System.in);
    		int n = in.nextInt();
    		int r = in.next().replaceAll("A", "").length();
    		System.out.println(n-r>r?"Anton":n-r<r?"Danik":"Friendship");
    	
    	}
*/
