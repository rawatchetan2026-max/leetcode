class Solution {
    public int sumOfSquares(int[] nums) {
        int len = nums.length , sum = nums[0] * nums[0];
        for(int i = 2 ; i <= len ; i++){
            if(len % i == 0){
                sum += nums[i - 1 ] * nums[i - 1 ];
            }            
        }
        return sum;
    }
}