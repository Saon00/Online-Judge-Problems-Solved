import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();

        while (t-- > 0) {
            int n = scan.nextInt();
            System.out.println(maxNumber(n));
        }

    }

    public static int maxNumber(int num) {
        int max = 0, mod;

        while (num > 0) {
            mod = num % 10;
            max = mod > max ? mod : max;
            num = num / 10;
        }
        return max;
    }

}

// https://codeforces.com/contest/1530/problem/A
