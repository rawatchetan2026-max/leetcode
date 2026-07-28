class Solution {
    public int climbStairs(int n) {
        /* recusive approach :::  */
        // if(n < 4){
        //     return n ;
        // }
        // return climbStairs(n-1) + climbStairs(n-2);

        /*  by dp */
        

        int[] dp = new int[n + 1 ];

        for(int i = 0 ; i <= n ; i++ ){
            if(i <= 3){
                dp[i] = i ; 
            }
            else{

            dp[i] = dp[i - 1] + dp[i - 2];
            }
        } 
        return dp[n];

    }
}