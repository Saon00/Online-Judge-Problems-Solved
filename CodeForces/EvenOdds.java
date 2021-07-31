import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong(), k = scan.nextLong();

        if ((n + 1) / 2 >= k) {
            System.out.println(k * 2 - 1);
        } else {
            System.out.println((k - (n + 1) / 2) * 2);
        }
    }
}

// https://codeforces.com/problemset/problem/318/A

/* 
    System.out.println((n+1)/2>=k?k*2-1:2*(k-(n+1)/2));
*/
