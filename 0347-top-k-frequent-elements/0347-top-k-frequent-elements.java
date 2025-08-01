import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        List<Integer> elements = new ArrayList<>(freq.keySet());

        elements.sort((a, b) -> {
            int cmp = freq.get(b) - freq.get(a);
            if (cmp != 0) return cmp;
            return a - b;
        });

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = elements.get(i);
        }
        return result;
    }
}
