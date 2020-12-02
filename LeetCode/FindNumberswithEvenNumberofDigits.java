// Find Numbers with Even Number of Digits 

class Solution {
    public int findNumbers(int[] nums) {
        int even=0;
        
        for(int i =0;i<nums.length;i++){
            int l = nums[i];
            String as = Integer.toString(l);
            if((as.length())%2==0){
                even+=1;
            }
        }
        return even;
    }
}
