import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        System.out.println(n % 2 == 0 ? n / 2 : (n / 2) - n);
    }
}

// https://codeforces.com/problemset/problem/486/A
