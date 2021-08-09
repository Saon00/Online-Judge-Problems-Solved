// Author: https://codeforces.com/profile/azmepm
import java.util.*;
public class code {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
    int n = x.nextInt();
   StringBuilder s=new StringBuilder();
    while (n-->0) {
      boolean f=true;
      long a=x.nextLong();
      // int count=0;
      double r=Math.sqrt(a);
      if(Math.floor(r)!=Math.ceil(r)){
        // System.out.println("NO");
        s.append("NO\n");
        continue;
      }
      int h=(int)r,i;
      for ( i = 2; i*i <= h; i++)        
        if(h%i==0){
          f=false;
          break;}
      s.append((f && h!=1)?"YES\n":"NO\n");
    }    
  System.out.println(s);    

	}
  }	

// https://codeforces.com/problemset/problem/230/B

/* This got time limit exceeds
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long num = scan.nextLong();
            System.out.println(isTPrime(num) == 3 ? "YES" : "NO");
        }
    }

    public static long isTPrime(long num) {
        int count = 0;
        for (long i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }
        return count;
    }
}
*/
