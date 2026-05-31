class Solution {
    public int mostFrequentEven(int[] nums) {
         int currF = 0, maxF = 0, ans = -1;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                if (i == 0 || nums[i] != nums[i - 1]) {
                    currF = 1;
                } else {
                    currF++;
                }

                if (currF > maxF) {
                    maxF = currF;

                    ans = nums[i];
                }
            }
        }
        return ans;
    }
}