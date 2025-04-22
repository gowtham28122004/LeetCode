import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
        
        Map<Integer, Integer> indexMap = new HashMap<>();
        
        for (int i = 0; i < score.length; i++) {
            pq.add(score[i]);
            indexMap.put(score[i], i);
        }
        
        String[] arr = new String[score.length];
        
        for (int i = 0; i < score.length; i++) {
            int t = pq.poll();
            int index = indexMap.get(t);
            
            if (i == 0) {
                arr[index] = "Gold Medal";
            } else if (i == 1) {
                arr[index] = "Silver Medal";
            } else if (i == 2) {
                arr[index] = "Bronze Medal";
            } else {
                arr[index] = String.valueOf(i + 1);
            }
        }
        
        return arr;
    }
}
