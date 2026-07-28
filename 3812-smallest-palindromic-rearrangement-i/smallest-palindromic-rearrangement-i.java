class Solution {
    public String smallestPalindrome(String s) {
      StringBuilder sb = new StringBuilder("");
        int n = s.length();
        if (n < 4) {
            return s;
        }

        char stoArr1[] = s.substring(0, n / 2).toCharArray();
        Arrays.sort(stoArr1);
        sb.append(stoArr1);

        if (n % 2 != 0) {
            sb.append(s.substring(n/2,(n/2)+1));
            for (int i = stoArr1.length -1 ; i >= 0; i--) {
                sb.append(stoArr1[i]);
            }
        } else {
            for (int i = stoArr1.length - 1; i >= 0; i--) {
                sb.append(stoArr1[i]);
            }
        }

       

        return  sb.toString();
    }
}