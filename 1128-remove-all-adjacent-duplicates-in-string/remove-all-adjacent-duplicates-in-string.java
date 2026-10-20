class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(s.length()-1));
        for(int i = s.length()-2 ; i >= 0; i--){
            if(st.isEmpty()){
                st.push(s.charAt(i));
                continue;
            }
            char top = st.peek();
            if(top == s.charAt(i)){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        StringBuffer sb = new StringBuffer("");
        while(!st.isEmpty()){
            char top = st.pop();
            sb = sb.append(top);
        }
        return sb.toString();
    }
}