class Solution {
    public void reverseString(char[] s) {
        int low = 0 , high = s.length - 1 ;
        
            while(low < high){
                s[high] = (char)(s[low] + s[high]);
                s[low] = (char)(s[high] - s[low]);
                s[high] = (char)(s[high] - s[low]);
                low++;
                high--;

            
        }
    }
}