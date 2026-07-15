class Solution {
    public int diagonalSum(int[][] mat) {
        int pd = 0 , sd = 0  ;
        for (int i = 0; i < mat.length; i++) {
            pd += mat[i][i];
            if (i == mat.length - 1 - i) {
                continue;
            } else {
                sd += mat[i][mat.length - 1 - i];

            }
        }
        return (sd + pd) ;
    }
}