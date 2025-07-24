class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        String res = "";
        int g = 0;

        for (int i = 0; i < s.length(); i++) {
            int l = i, r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (g < r - l + 1) {
                    res = s.substring(l, r + 1);
                    g = r - l + 1;
                }
                l--;
                r++;
            }
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (g < r - l + 1) {
                    res = s.substring(l, r + 1);
                    g = r - l + 1;
                }
                l--;
                r++;
            }
        }
        return res;
    }
}
