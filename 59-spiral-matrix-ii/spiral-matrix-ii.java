class Solution {
    public int[][] generateMatrix(int n) {
        int m[][] = new int[n][n];
        int stRow = 0, stCol = 0, endCol = n - 1, endRow = n - 1, num = 1;

        if (n == 1) {
            return new int[][] { { n } };
        }

        while (num <= n * n) {
            for (int i = stCol; i <= endCol; i++) {
                m[stRow][i] = num++;
            }
            for (int i = stRow + 1; i <= endRow; i++) {
                m[i][endCol] = num++;
            }
            for (int i = endCol - 1; i >= stCol; i--) {
                m[endRow][i] = num++;
            }
            for (int i = endRow - 1; i > stRow; i--) {
                m[i][stCol] = num++;
            }
            stCol++;
            stRow++;
            endCol--;
            endRow--;

        }

        return m;
    }
    }
