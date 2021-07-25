
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        int x = 0, y = 0, z = 0;

        while (t-- > 0) {
            x += scan.nextInt();
            y += scan.nextInt();
            z += scan.nextInt();
        }
        System.out.println(x == 0 && y == 0 && z == 0 ? "YES" : "NO");
    }
}

// https://codeforces.com/problemset/problem/69/A

/* Another way using for loop[collected]
import java.util.*;
public class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),x=0,y=0,z=0;
		for(;n-->0;x+=sc.nextInt(),y+=sc.nextInt(),z+=sc.nextInt());
		System.out.print(x==0&y==0&z==0?"YES":"NO");
	}
}
*/
