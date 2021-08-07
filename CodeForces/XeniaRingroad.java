import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), m = scan.nextInt();
        long count = 0;
        int[] arr = new int[m + 1];
        arr[0] = 1;
        for (int i = 1; i <= m; i++)
            arr[i] = scan.nextInt();

        for (int i = 0; i < m; i++) {
            if (arr[i] > arr[i + 1])
                count += n - arr[i] + arr[i + 1];
            else
                count += arr[i + 1] - arr[i];
        }
        System.out.println(count);
    }
}

// https://codeforces.com/problemset/problem/339/B

/* credit: cypherK21
import java.util.*;
public class XeniaAndRingRoad {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		long cnt=0;int p=1;
		for(int i=0;i<m;i++) {
			int a=sc.nextInt();
			if(a<p) cnt+=n+a-p;
			else cnt+=a-p;
			p=a;
		}
		System.out.println(cnt);
	}
}
*/
