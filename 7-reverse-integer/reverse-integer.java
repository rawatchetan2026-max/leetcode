class Solution {
    public int reverse(int x) {
        if(x == Integer.MIN_VALUE) return 0;
        int n1 = x;
        boolean isNegative = false;
        double rev = 0;
        if( n1 < 0){
            isNegative = true;
            n1 = -n1;
        }
        while(n1 > 0 ){
            rev *= 10;
            rev += n1%10 ;
            n1 = n1/10;
        }
        if(rev > Integer.MAX_VALUE) return 0;
        
        if(isNegative) return -(int)rev;
        return (int)rev;
    }
}