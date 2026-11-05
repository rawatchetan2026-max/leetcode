class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = arr1.length ; 
        for(int i = 0 ; i < arr1.length ; i++){
            int left = 0 , right = arr2.length -1;
            while(left <= right){
                int mid = (left + right)/2;
                if(Math.abs(arr1[i] - arr2[mid] )<= d){
                    count--;
                    break;
                }
                else if(arr2[mid] < arr1[i]){
                    left = mid + 1 ;
                }
                else{
                    right = mid - 1;
                }
            }
        }return count;
    }
}