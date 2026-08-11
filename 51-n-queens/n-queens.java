class Solution {
    public static boolean isSafe(char[][] board , int row , int col){

        int n = board.length;
        for(int i = 0 ; i < n ; i++){
            if(board[row][i]=='Q'){
                return false;
            }
        }
        for(int i = 0 ; i < n ; i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        int i = row , j = col ; 
        // for NE
        while(i >= 0 && j < n){
            if(board[i][j] == 'Q'){
                return false;
            }
            i--;j++;
        }
        // for SE
        i = row ; j = col;
        while( i < n && j < n ){
            if(board[i][j] == 'Q'){return false;}
            i++;j++;
        }
        //for SW 
        i = row ; j = col;
        while( i < n && j >= 0 ){
            if(board[i][j] == 'Q'){return false;}
            i++;j--;
        }
        //for NW
        i = row ; j = col;
        while( i >=0 && j >= 0 ){
            if(board[i][j] == 'Q'){return false;}
            i--;j--;
        }   

        return true;
    }
   
    public static List<List<String>> solveNQueen(char[][] board , int row , List<List<String>> li){
       int n = board.length;

        List<String> l = new ArrayList<>();
        if(row == n){
            String s = new String("");
            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < n ; j++){
                    s += "" + board[i][j];
                }
                l.add(s);
                s= "";
            }
            li.add(l);
            return li;
        }
        for(int i = 0 ; i < n ; i++){
            if(isSafe(board , row , i)){
                board[row][i] = 'Q';
                solveNQueen(board , row+1 , li);
                board[row][i] = '.';
                
            }
        }
        return li;
        
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> li = new ArrayList<>();


         char board[][] = new char[n][n];
    
    for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < n ; j++){
            board[i][j] = '.';
        }
    }
    
    return solveNQueen(board, 0 , li);
    }

}
