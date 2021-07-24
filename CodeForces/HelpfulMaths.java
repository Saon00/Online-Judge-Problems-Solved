import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Arrays.sort(args = new Scanner(System.in).nextLine().split("\\+"));
        System.out.print(String.join("+", args));
    }
}

// https://codeforces.com/problemset/problem/339/A

/* details
Scanner scan = new Scanner(System.in);

String[] line = scan.nextLine().split("\\+");
Arrays.sort(line);
System.out.print(String.join("+", line));
*/
