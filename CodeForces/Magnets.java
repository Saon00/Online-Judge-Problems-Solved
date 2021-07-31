import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int sum = 0;
        String[] line = new String[n];

        for (int i = 0; i < n; i++) {
            line[i] = scan.next();
        }

        for (int i = 0; i < n - 1; i++) {
            if (line[i].equals(line[i + 1])) {
                sum = sum;
            } else sum++;
        }
        System.out.println(sum + 1);

    }
}

// https://codeforces.com/problemset/problem/344/A

/* recommenned solution: 

import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int b = 0;
		for(int i=0; i<n; i++){
			int a = sc.nextInt();
			if(a != b)
				count++;
			b = a;
		}
		System.out.println(count);
	}
}

*/
