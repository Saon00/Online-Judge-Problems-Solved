import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        System.out.println(scan.next().toLowerCase().chars().distinct().count()==26 ? "YES" : "NO");
    }
}

// https://codeforces.com/problemset/problem/520/A
