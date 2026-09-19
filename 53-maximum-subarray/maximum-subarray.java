class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0] , currSum = nums[0];

        for(int i = 1 ; i < nums.length ; i++){
            currSum = Math.max(nums[i] , currSum + nums[i]);
            if(currSum > maxSum) maxSum = currSum;
        } 
        return maxSum;
    }
}