import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char[] line_1 = scan.nextLine().toCharArray();
        char[] line_2 = scan.nextLine().toCharArray();

        for (int i = 0; i < line_1.length; i++) {
            System.out.print(line_1[i] == line_2[i] ? "0" : "1");
        }
    }
}

// https://codeforces.com/problemset/problem/61/A

/* it also can be solved by using Bitwise Operator: https://www.geeksforgeeks.org/bitwise-operators-in-java/

Scanner scan = new Scanner(System.in);
        String line_1 = scan.nextLine();
        String line_2 = scan.nextLine();

        for (int i = 0; i < line_1.length(); i++) {
            System.out.print(line_1.charAt(i)^line_2.charAt(i));
        }
*/
