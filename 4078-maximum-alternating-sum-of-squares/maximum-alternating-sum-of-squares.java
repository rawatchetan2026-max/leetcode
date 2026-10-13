class Solution {
    public long maxAlternatingSum(int[] nums) {
        int len = nums.length ;
        long sum = 0;
        for(int i = 0 ; i < len ; i++){
            if(nums[i] < 0){
                nums[i] = -(nums[i]);
            }
        }
        Arrays.sort(nums);
        len=nums.length-1 ;
        int i = 0 ; 
        while(i <= len){
            sum += nums[len]*nums[len] - nums[i]*nums[i];
            len--;
            i++;
        }
        len = nums.length;
        if(len % 2 != 0){
            sum += nums[len/2]*nums[len/2];
        }

        
        return sum;
    }
}