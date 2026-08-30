class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;
        int maxIdx = -1 , minIdx = -1;
        for(int i = 0 ; i < nums.length ; i++){
            if(min >= nums[i]){
            min = nums[i];
            minIdx = i;
        }
        if(max <= nums[i]){
            max = nums[i];
            maxIdx = i;
        }
        }
       int left = Math.max(minIdx, maxIdx) + 1; 
        int right = nums.length - Math.min(minIdx, maxIdx);
        int both = Math.min(minIdx, maxIdx) + 1 + nums.length - Math.max(minIdx, maxIdx);
        return Math.min(left, Math.min(right, both)); }
    
}