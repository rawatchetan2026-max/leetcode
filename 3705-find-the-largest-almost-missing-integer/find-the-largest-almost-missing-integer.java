class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;

        if (k == n) {
            int max = Integer.MIN_VALUE;

            for (int x : nums) {
                max = Math.max(max, x);
            }

            return max;
        }

        if (k == 1) {
    int ans = -1;

    for (int i = 0; i < n; i++) {
        int count = 0;

        for (int j = 0; j < n; j++) {
            if (nums[i] == nums[j]) {
                count++;
            }
        }

        if (count == 1) {
            ans = Math.max(ans, nums[i]);
        }
    }

    return ans;
}

        int count1 = 0;
        int count2 = 0;

        for (int x : nums) {
            if (x == nums[0]) count1++;
            if (x == nums[n - 1]) count2++;
        }

        if (count1 == 1 && count2 == 1) {
            return Math.max(nums[0], nums[n - 1]);
        }

        if (count1 == 1) {
            return nums[0];
        }

        if (count2 == 1) {
            return nums[n - 1];
        }

        return -1;
    }
}