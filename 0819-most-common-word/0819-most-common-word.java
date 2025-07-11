import java.util.HashMap;
import java.util.Map;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bs = new HashSet<>(Arrays.asList(banned));
        
        String np = paragraph.replaceAll("[!?',;.]"," ").toLowerCase();
        
        String[] words = np.split(" ");
        
        Map<String, Integer> wordCount = new HashMap<>();
        
        for (String word : words) {
            if (!bs.contains(word) && !word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        
        String mostCommon = null;
        int maxCount = 0;
        
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostCommon = entry.getKey();
            }
        }
        
        return mostCommon;
    }
}
