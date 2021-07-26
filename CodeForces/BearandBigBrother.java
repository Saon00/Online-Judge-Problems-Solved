import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt(), b = scan.nextInt(), c = 0;

        while (a <= b) {
            a *= 3;
            b *= 2;
            c++;
        }
        System.out.println(c);
    }
}

// https://codeforces.com/problemset/problem/791/A
