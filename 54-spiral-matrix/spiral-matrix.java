class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> L = new ArrayList<>();
        int stRow = 0, stCol = 0, endRow = matrix.length - 1, endCol = matrix[0].length - 1;

        while (stRow <= endRow && endCol >= stCol) {
            for (int i = stCol; i <= endCol; i++) {
                L.add(matrix[stRow][i]);
            }
            for (int i = stRow + 1; i <= endRow; i++) {
                L.add(matrix[i][endCol]);
            }
            if(stRow < endRow){
                
            for(int i = endCol - 1; i >= stCol; i--) {
                L.add(matrix[endRow][i]);
            }
            }
            if(endCol > stCol){

            for (int i = endRow - 1; i > stRow; i--) {
                L.add(matrix[i][stCol]);
            }
            }
            stCol++;
            stRow++;
            endCol--;
            endRow--;

        }
        return L;
    }
}