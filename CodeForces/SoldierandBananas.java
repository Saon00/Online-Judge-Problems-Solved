import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int k = scan.nextInt(), n = scan.nextInt(), w = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= w; i++) {
            sum += i * k;
        }
        System.out.println(n < sum ? sum - n : 0);
    }
}

// https://codeforces.com/problemset/problem/546/A
