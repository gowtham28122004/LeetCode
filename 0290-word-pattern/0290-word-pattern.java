import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if (str.length != pattern.length()) return false;

        Map<Character, String> map = new LinkedHashMap<>();
        Set<String> hs = new HashSet<>();

        for (int i = 0; i < str.length; i++) {
            char ch = pattern.charAt(i);
            String word = str[i];

            if (!map.containsKey(ch)) {
                if (hs.contains(word)) return false;

                map.put(ch, word);
                hs.add(word);
            } else if (!map.get(ch).equals(word)) {
                return false;
            }
        }

        return true;
    }
}
