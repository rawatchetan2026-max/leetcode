class Solution {
    public int[] replaceElements(int[] arr) {
        int[] arr1 = new int[arr.length];
        
        if(arr.length == 1){
            arr1[0] = -1 ;
            return arr1;
        }

        arr1[arr.length - 1] = -1;
        int k = arr1[arr.length - 1];

        for(int i = arr.length - 1 ; i >= 1 ; i--){
            if(arr[i] > k){
                k = arr[i];
                arr1[i - 1 ] = k ; 
            }
            else{
                arr1[ i - 1 ] = k ;
            }
        }
        return arr1;

    }
}