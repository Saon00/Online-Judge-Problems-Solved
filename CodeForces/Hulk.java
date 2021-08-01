import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        byte n = scan.nextByte();

        for(byte i=1; i<n; i++){
            System.out.print(i%2==0 ? "I love that " : "I hate that ");
        }
        if(n%2==0) System.out.println("I love it");
        else System.out.println("I hate it");
    }
}

// https://codeforces.com/problemset/problem/705/A

/* another way
 for(int i=1;i<=n;i++)
	{
	 System.out.print("I "+(i%2==0?"love":"hate")+" "+(i==n?"it ":"that "));
	}
*/
