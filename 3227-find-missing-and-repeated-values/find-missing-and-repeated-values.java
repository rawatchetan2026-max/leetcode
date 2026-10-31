class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int total = grid.length;
        int[] arr = new int[total * total];
        int res[] = new int[2];
        for(int i = 0 ; i < total ; i++){
            for(int j = 0 ; j < total ; j++){
                arr[grid[i][j] - 1] += 1;
                
            }
        }
        int miss = 0;
        for(int i = 0 ; i < total*total ; i++){
            if(arr[i] == 0){
                res[1] = i+1;
            }
            if(arr[i] == 2){
                res[0] = i+1;
            }
        }
        return res;
    }
}