class Solution {
    public boolean judgeCircle(String moves) {
        int Up = 0 , Left = 0;
        for(int i = 0 ; i < moves.length() ; i++){
            if(moves.charAt(i) == 'U'){
                Up++ ;
            }
            if(moves.charAt(i) == 'D'){
                Up-- ;
            }
            if(moves.charAt(i) == 'L'){
                Left++;
            }
            if(moves.charAt(i) == 'R'){
                Left--;
            }
        }
        if(Up == 0 && Left == 0){
            return true;
        }
        return false ;
        
    }
}