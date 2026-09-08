class Solution {
    public int countCommas(int n) {
        int n1 = n, c = 0; 
        while(n1 > 0 ){
            n1 = n1/10;
            c++;
        }  
        if(c >= 4) return n - 999;
        return 0; 
    }
}