import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String evenString="";
        String oddString="";
        int num = scan.nextInt();
        scan.nextLine();
        
        for(int i=0;i<num;i++) {
            String name = scan.nextLine();
            char[] charArray = name.toCharArray();

            for(int j=0;j<name.length();j++) {
                if(j%2==0) {
                    evenString+=charArray[j];
                }
                else {
                    oddString+=charArray[j];
                }
            }
            System.out.println(evenString+" "+oddString);
            evenString = oddString = "";
        }
    }
}
