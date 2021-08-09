import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), m = scan.nextInt();
        System.out.println(Math.min(n,m)%2==0 ? "Malvika" : "Akshat");
    }
}

// https://codeforces.com/problemset/problem/451/A
