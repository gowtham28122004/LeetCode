import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        Stack<int[]> ar = new Stack<>();
        ar.push(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] top = ar.peek();
            int[] current = intervals[i];

            if (current[0] <= top[1]) {
                top[1] = Math.max(top[1], current[1]);
            } else {
                ar.push(current);
            }
        }

        return ar.toArray(new int[ar.size()][]);
    }
}
