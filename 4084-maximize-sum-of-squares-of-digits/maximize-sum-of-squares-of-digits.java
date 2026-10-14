class Solution {
    public String maxSumOfSquares(int num, int sum) {
        double n = (double)sum / num;
        if(n > 9) return "";

        if(sum <= 9){
            String str =sum+"";
            str += "0".repeat(num-1);
            return str;
        }
        StringBuffer sb = new StringBuffer("");
        int val = 9  ;
        for(int i = 0 ; i < num ; i++){
            if(sum > 9){
                sb.append(val+"");
                sum -= val;
            }
            else if (sum > 0){
                sb.append(sum+"");
                sum-=sum;
            }
            else{
                sb.append("0");
            }
        }   
        return sb.toString();
    }
}