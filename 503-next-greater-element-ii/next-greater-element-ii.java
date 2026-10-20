class Solution {
    public int[] nextGreaterElements(int[] nums) {
         int len = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[len];
        for(int i = 2 * len-1; i >= 0 ; i--){
                while(!st.isEmpty() && nums[i%len] >= nums[st.peek()] ){
                    st.pop();
                }
            if(st.isEmpty()){
                res[i%len] = -1;
            }   
            else{
                res[i%len] = nums[st.peek()];
            }
            st.push(i%len);
        }        
        return res;
    }
}