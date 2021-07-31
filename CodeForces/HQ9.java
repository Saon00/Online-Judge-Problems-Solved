import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(scan.next().matches(".*[HQ9].*") ? "YES" : "NO");
    }
}

// https://codeforces.com/problemset/problem/133/A
