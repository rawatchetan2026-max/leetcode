class Solution {
    public double myPow(double x, int n) {
        long a = n;
        if(n == 0 ){
            return 1 ; 
        }
        double ans = 1 , halfSq = 1 ;
        if(n > 0){

        halfSq = myPow(x , n / 2);
        ans = halfSq * halfSq ;
        if(n%2 != 0){
            ans *= x ; 
        }
        }
        if(n < 0){
            a = -(long)n;
            halfSq = myPow(x , (int)(a / 2));
            ans = 1 /(halfSq * halfSq) ;
            if(n%2 != 0){
                ans = ans * (1/x); 
        }}
        return ans ;
    }
}
