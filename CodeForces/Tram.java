import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt(), a, b, temp = 0, total = 0;

        while (t-- > 0) {
            a = scan.nextInt();
            b = scan.nextInt();
            temp = (temp - a) + b;
            if (temp > total)
                total = temp;
        }
        System.out.println(total);
    }
}

// https://codeforces.com/problemset/problem/116/A

/* Differenct way

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt(), input = 0, total = 0;

        for (; t-- > 0; input -= scan.nextInt(), input += scan.nextInt()) {
            total = input > total ? input : total;
        }
        System.out.println(total);
    }
}

*/
