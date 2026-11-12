class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count = 1;
        if(nums.length == 1){
            return count;
        }
        boolean inc = (nums[0] > nums[1])? true : false;
        int len = 0 ; 
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i-1] < nums[i]){
                if(inc == false){
                    inc = true;
                    count = 1;}
                count++;
            }
            else if(nums[i-1] == nums[i]){
                count = 1;
            }
            else if(nums[i-1] > nums[i]){
                if(inc == true){
                    inc = false; 
                    count = 1;
                }
                count++;
            }
            len = Math.max(len , count);
        }
        return len;
    }
}