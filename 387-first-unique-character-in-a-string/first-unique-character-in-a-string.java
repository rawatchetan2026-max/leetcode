class Solution {
    public int firstUniqChar(String s) {
        int freq[] = new int[26];
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < s.length() ; i++){
            freq[s.charAt(i) - 'a'] += 1;
        }
        int res = -1;
        for(int i = 0 ; i < s.length() ; i++){
            if(freq[s.charAt(i) - 'a'] == 1){
                res = i;
                break;
            }
        }
        

        return res;
    }
}