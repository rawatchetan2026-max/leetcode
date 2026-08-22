class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length ;
        if(n < 2 ){
            return true ;
        }   
        int toggle = 0 ;

        for(int i = 1 ; i < n ; i++){
            if(nums[i] > nums[i - 1 ]){
              if(toggle == 0) toggle = 1 ; 
              else if(toggle == -1 ) return false;
            }
            else if( nums[i] < nums[i - 1 ]){
                if(toggle == 0) toggle = -1 ; 
                else if(toggle == 1) return false ;
            }
        }
        return true ;
    }
}