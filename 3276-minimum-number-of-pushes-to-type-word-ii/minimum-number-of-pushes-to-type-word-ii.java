class Solution {
    public int minimumPushes(String word) {
         int arr[] = new int[26];
        
        for(int i=0 ; i < word.length() ; i++){
            arr[word.charAt(i) - 'a']++;
        }
        Arrays.sort(arr);

        int totalPushes = 0 ;
        int counter = 0 ; 
        int one = 1 , two = 2 , three = 3 , four = 4 ; 

        for(int i = arr.length - 1; i >= 0 ; i--){
            if(arr[i] == 0 ){
                continue;
            }
            if(counter <= 7){
                totalPushes += arr[i] * one;
                counter++;
            }
            else if(counter <= 15){
                totalPushes += arr[i] * two ;
                counter++;
            }
            else if(counter <= 23){
                totalPushes += arr[i] * three ;
                counter++;
            }
            else if(counter <= 25) {
                totalPushes += arr[i] * four;
                counter++;
            }
        }
        
       return totalPushes;
    }
}