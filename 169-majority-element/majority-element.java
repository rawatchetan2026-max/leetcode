class Solution {
    public int majorityElement(int[] nums) {
        // MOORE'S VOTING ALGO....
        int freq = 0 , ele = 0;
        for(int val : nums){
            if(freq == 0){
                ele = val;
            }
            if(ele == val){
                freq++;
            }
            else{
                freq--;
            }
        }
        return ele;
    }
}