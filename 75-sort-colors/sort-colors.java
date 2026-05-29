class Solution {
    public void sortColors(int[] nums) {
        int Z = 0 , O = 0 , T = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0 ){
                Z++;
            }
            if(nums[i] == 1 ){
                O++;
            }
            if(nums[i] == 2 ){
                T++;
            }
        }
        for(int i = 0 ; i < Z ; i++){
            nums[i] = 0 ; 
        }
        for(int i = Z ; i < Z + O ; i++){
            nums[i] = 1; 
        }
        for(int i = O + Z ; i < O+Z+T ;i++){
            nums[i] = 2;
        }
        System.out.println(nums);
    }
}