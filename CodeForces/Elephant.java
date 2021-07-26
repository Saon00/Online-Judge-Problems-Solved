import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(n % 5 == 0 ? n / 5 : (n / 5 + 1));
    }
}

// https://codeforces.com/problemset/problem/617/A
