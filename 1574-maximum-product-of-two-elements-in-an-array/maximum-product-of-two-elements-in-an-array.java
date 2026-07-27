class Solution {
    public int maxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE , max2 = Integer.MIN_VALUE;
        int i = 0 , j = 0 ;
        for(int k = 0 ; k < nums.length ; k++){
            if(max1 < nums[k]){
                max2 = max1 ;
                j = i ; 
                i = k ; 
                max1 = nums[k];
            }
            else if(max2 < nums[k]){
                j = k ;
                max2 = nums[k];
            }
        }
        return ((nums[i] - 1 )* (nums[j] - 1 ));

    }
}