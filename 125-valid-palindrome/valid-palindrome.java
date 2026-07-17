class Solution {
    public boolean isPalindrome(String s) {
    //     String s1 = "" , s2 = s.toLowerCase().replaceAll("[^a-zA-Z0-9]" , "");
    //     for(int i = s2.length() - 1 ; i>= 0 ; i--){
    //         s1 += s2.charAt(i);
    //     }

    //    return s2.equals(s1);
    // String cleanStr = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        
    //     // Use StringBuilder to reverse efficiently
    //     StringBuilder sb = new StringBuilder(cleanStr);
    //     String reversedStr = sb.reverse().toString();
        
    //     return cleanStr.equals(reversedStr);
            String s1 = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String s2 = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int res = 0;
        for (int i = s2.length() - 1; i >= s2.length() / 2; i--) {
            if (s1.charAt(i) == s2.charAt(s2.length() - 1 - i)) {
                res = 1;
            } else {
                return false;
            }
        }

        return true;

    }
}