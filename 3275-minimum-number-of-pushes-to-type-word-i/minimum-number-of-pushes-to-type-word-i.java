class Solution {
    public int minimumPushes(String word) {
        int len = word.length() ;
        if(len <=8){
            return len;
        }
        int one = 1 , two = 2 , three = 3 , four = 4 ;
        int count = 0 ; 
        for(int i = 0 ; i < len ; i++){
            if(i <= 7 ){
                count += one ;
            }
            else if(i <= 15){
                count += two;
            }
            else if(i<=23){
                count+=three;
            }
            else{
                count += four;
            }
        }
        return count;
    }
}