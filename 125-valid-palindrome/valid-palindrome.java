class Solution {
    public boolean isPalindrome(String s) {
        String s1 = "" , s2 = s.toLowerCase().replaceAll("[^a-zA-Z0-9]" , "");
        for(int i = s2.length() - 1 ; i>= 0 ; i--){
            s1 += s2.charAt(i);
        }

       return s2.equals(s1);
    }
}