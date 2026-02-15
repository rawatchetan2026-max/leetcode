import java.util.Arrays;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[n + i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 2 };
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.shuffle(nums, (nums.length) / 2)));
    }
}
