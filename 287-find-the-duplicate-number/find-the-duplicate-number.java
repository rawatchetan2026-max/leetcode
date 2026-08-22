class Solution {
    public int findDuplicate(int[] nums) {
      /*   if(nums.length == 2 ){
            if(nums[0] == nums[1]) return nums[0];
        } */
        int[] arr = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++) arr[i] = nums[i];

        Arrays.sort(arr);

        for(int i = 1 ; i < nums.length ; i++) if(arr[i-1] == arr[i]) return arr[i];
        
        return -1;
    }
}