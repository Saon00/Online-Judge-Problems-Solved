package uri;
import java.util.*;

public class MainClass { 												  	//md. saon sikder
	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		int[] array=new int[10];
		int i,num;
		
		for(i=0;i<array.length;i++) {
			array[i]=input.nextInt();
			if(array[i]<1) {
				array[i]=1;
		}
			else {
				array[i]=array[i];
			}
			System.out.println("X["+i+"] = "+array[i]);
			}
		
		}
	}

	
 
