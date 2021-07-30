import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), h = scan.nextInt();
        int sum = 0;
        while (n-- > 0) {
            int p = scan.nextInt();
            sum = p > h ? sum += 2 : p <= h ? sum += 1 : sum;
        }
        System.out.println(sum);
    }
}

// https://codeforces.com/problemset/problem/677/A
