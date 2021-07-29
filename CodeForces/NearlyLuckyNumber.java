import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.next().replaceAll("[^47]", "").length();
        System.out.println(num == 4 || num == 7 ? "YES" : "NO");
    }
}

// https://codeforces.com/problemset/problem/110/A
