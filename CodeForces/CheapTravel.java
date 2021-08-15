import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), m = scan.nextInt(), a = scan.nextInt(), b = scan.nextInt();
        System.out.println(Math.min(n * a, (n / m) * b + Math.min((n % m) * a, b)));
    }
}

// https://codeforces.com/problemset/problem/466/A
