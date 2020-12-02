// Squares of a Sorted Array

class Solution {
    public int[] sortedSquares(int[] A) {
        
        int[] result_array = new int[A.length];
		
		for(int i = 0;i<A.length;i++) {
			result_array[i] = A[i]*A[i]; 
		}
		
		Arrays.sort(result_array);
        
         return result_array;
    }
}
