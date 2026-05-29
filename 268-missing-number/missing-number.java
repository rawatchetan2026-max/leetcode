class Solution {
    public int missingNumber(int[] nums) {
        int totalSum = nums.length , arrSum = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            totalSum += i;
            arrSum += nums[i];
        }
        return totalSum - arrSum;
    }
}