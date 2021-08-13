import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), m = scan.nextInt();
        int time = 0, count = 0;

        for (int i = 1; i <= n; i++) {
            time += i * 5;
            if (240 < time + m) {
                break;
            } else count++;
        }
        System.out.println(count);
    }
}

// https://codeforces.com/problemset/problem/750/A

/* Collected: HunTer11
import java.util.*;
public class Code1{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();int k=s.nextInt();
        while((n*(n+1)/2)*5>240-k)n-=1;
        System.out.print(n);
    }
}
*/
