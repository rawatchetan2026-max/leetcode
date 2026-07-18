class Solution {
    public int maxArea(int[] height) {
        //  int n = height.length, area = 0, curr = Integer.MIN_VALUE;

        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         int width = j - i;
        //         area = Math.min(height[i], height[j]) * width;

        //     curr = Math.max(area, curr);
        //     }

        // }
        // return curr;
        int left = 0, right = height.length - 1;
        int ans = Integer.MIN_VALUE;
        while (left < right) {

            int area = Math.min(height[left], height[right]) * (right - left);
            System.out.println(area);
            ans = Math.max(ans, area);
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return ans;
    }
}