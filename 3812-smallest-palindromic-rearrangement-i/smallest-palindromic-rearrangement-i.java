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
            char stoArr3[] = s.substring((n / 2) + 1, n).toCharArray();
            Arrays.sort(stoArr3);
            for (int i = stoArr3.length -1 ; i >= 0; i--) {
                sb.append(stoArr3[i]);
            }
        } else {
            char stoArr2[] = s.substring(n / 2, n).toCharArray();
            Arrays.sort(stoArr2);
            for (int i = stoArr2.length - 1; i >= 0; i--) {
                sb.append(stoArr2[i]);
            }
        }

        String ans = sb.toString();

        return ans;
    }
}