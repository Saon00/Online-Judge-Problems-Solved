import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), k = scan.nextInt();
        
        while (k-- > 0) {
            n = lastNumber(n) == 0 ? n / 10 : n - 1; // or // n = n%10 == 0 ? n / 10 : n - 1;   
        }
        System.out.println(n);

    }

    public static int lastNumber(int n) {
        int last = n % 10;
        return last;
    }
}

// https://codeforces.com/problemset/problem/977/A
