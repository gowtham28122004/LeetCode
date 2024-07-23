class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapping = new HashMap<>();

        for (int i=0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (!mapping.containsKey(sChar)) {
                if (mapping.values().contains(tChar)) {
                    return false;
                } else {
                    mapping.put(sChar, tChar);
                }
            } else {
                if (!mapping.get(sChar).equals(tChar)) {
                    return false;
                }
            }

        }

        return true;
    }
}