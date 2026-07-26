class Solution {
    public int maximumProduct(int[] nums) {
        int m1 = Integer.MIN_VALUE, m2 = Integer.MIN_VALUE, m3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (min1 > nums[i]) {
                min2 = min1;
                min1 = nums[i];
            } else if (min2 > nums[i]) {
                min2 = nums[i];
            }
            if (m1 < (nums[i])) {
                m3 = m2;
                m2 = m1;
                m1 = nums[i];
            } else if (m2 < nums[i]) {
                m3 = m2;
                m2 = nums[i];
            } else if (m3 < nums[i]) {
                m3 = nums[i];
            }
        }
        return Math.max(min1 * min2 * m1, m1 * m2 * m3);
    }
}