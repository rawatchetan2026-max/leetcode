class Solution {
    public int thirdMax(int[] nums) {
        long m1 = Long.MIN_VALUE, m2 = Long.MIN_VALUE, m3 = Long.MIN_VALUE ;
        for (int i = 0; i < nums.length; i++) {
           
            if (m1 < nums[i]) {
                m3 = m2;
                m2 = m1;
                m1 = nums[i];
            } else if (m2 < nums[i] && nums[i] != m1) {
                m3 = m2;
                m2 = nums[i];
            } else if (m3 < nums[i] && nums[i] != m1 && nums[i] != m2) {
                m3 = nums[i];
            }
        }
        
        return m3 == Long.MIN_VALUE ? (int)m1 : (int)m3;
    }
}