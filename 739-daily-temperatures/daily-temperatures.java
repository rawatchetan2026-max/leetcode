class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int len = temperatures.length;
        int[] answer = new int[len];
        answer[len-1] = 0;
        for(int i = len-1 ; i >= 0 ; i--){
            while(!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                answer[i] = 0;
            }
            else{
                answer[i] = st.peek() - i ;
            }
        st.push(i);

        }
        return answer;
    }
}