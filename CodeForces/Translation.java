import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        StringBuffer stringBuffer = new StringBuffer(t).reverse();
        System.out.println(s.equalsIgnoreCase(stringBuffer.toString()) ? "YES" : "NO");

    }
}

// https://codeforces.com/problemset/problem/41/A
