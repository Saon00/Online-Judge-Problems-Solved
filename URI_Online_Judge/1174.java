package uri;
import java.util.*;

public class MainClass { 													    //md. saon sikder
	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
	float[] array=new float[100];
	for(int i=0;i<array.length;i++) {
		array[i]=input.nextFloat();
		
		if(array[i]<=10) {
			System.out.println("A["+i+"] = "+array[i]);
		}
		else {
			continue;
		}
	}
		
		
		}
	}

	
 
