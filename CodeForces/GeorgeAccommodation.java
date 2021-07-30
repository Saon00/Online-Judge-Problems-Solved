import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        while (n-- > 0) {

            if (Math.abs(scan.nextInt() - scan.nextInt()) >= 2) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}

// https://codeforces.com/contest/467/problem/A
