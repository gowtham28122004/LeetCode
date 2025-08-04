import java.util.*;

class Solution {
    public String[] findWords(String[] words) {
        String line1 = "qwertyuiop";
        String line2 = "asdfghjkl";
        String line3 = "zxcvbnm";

        ArrayList<String> result = new ArrayList<>();

        for (String word : words) {
            String lowerWord = word.toLowerCase();
            char firstChar = lowerWord.charAt(0);

            boolean inLine1 = line1.indexOf(firstChar) != -1;
            boolean inLine2 = line2.indexOf(firstChar) != -1;
            boolean inLine3 = line3.indexOf(firstChar) != -1;

            boolean isValid = true;

            for (int j = 1; j < lowerWord.length(); j++) {
                char ch = lowerWord.charAt(j);

                if (inLine1 && line1.indexOf(ch) == -1) {
                    isValid = false;
                    break;
                } else if (inLine2 && line2.indexOf(ch) == -1) {
                    isValid = false;
                    break;
                } else if (inLine3 && line3.indexOf(ch) == -1) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }
}
