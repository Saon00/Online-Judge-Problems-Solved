import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt(), count = 0;
        int[] arrH = new int[t];
        int[] arrA = new int[t];

        for (int i = 0; i < t; i++) {
            arrH[i] = scan.nextInt();
            arrA[i] = scan.nextInt();
        }

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if (i != j && arrH[i] == arrA[j])
                    count++;
            }
        }
        System.out.println(count);

    }
}

// https://codeforces.com/problemset/problem/268/A
// Analysis: https://codeforces.com/blog/entry/6545?locale=en
