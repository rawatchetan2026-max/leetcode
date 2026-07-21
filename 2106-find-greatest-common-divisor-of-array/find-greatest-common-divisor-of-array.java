class Solution {
    public  static int gcd(int max , int min){
         return (min == 0) ? max : gcd(min, max%min);
    }
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length ; i++){
            if(max < nums[i]){
                max = nums[i];
            }
            if(min > nums[i]){
                min = nums[i] ;
            }
        }
        return gcd(max, min);

    }
}