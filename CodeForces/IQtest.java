import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt(), even = 0, odd = 0;
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] % 2 == 0)
                even++;
            else odd++;
        }
        if (even > odd) {
            for (int i = 0; i < t; i++) {
                if (arr[i] % 2 != 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
        } else {
            for (int i = 0; i < t; i++) {
                if (arr[i] % 2 == 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}

// https://codeforces.com/problemset/problem/25/A

/* Recommended

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt(), even = 0, odd = 0;

        for (int i = 1; i <= t; i++) {
            if (scan.nextInt() % 2 == 0) even += i;
            else odd += i;
        }
        System.out.println(Math.min(even, odd));
    }
}

*/
