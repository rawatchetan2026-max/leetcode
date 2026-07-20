class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length , n = grid[0].length;
        int[] arr = new int[m * n];
        int count = 0 ;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                arr[count++] = grid[i][j];
            }
        }
        int[] arr1 = new int[m*n];
        for(int i = 0 ; i < count ; i++){
            arr1[(i + k) % count] = arr[i];
        }
        count = 0;
        List<List<Integer>> newGrid = new ArrayList<>();
        for(int i = 0 ; i < m ; i++){
            List<Integer> row = new ArrayList<>();

            for(int j = 0 ; j < n ; j++){
                grid[i][j] = arr1[count++];
                row.add(grid[i][j]);
            }
            newGrid.add(row);
        }
        return newGrid;
    }
}