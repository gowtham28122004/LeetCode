class Solution {
    public int maximumWealth(int[][] accounts) {

        int max = Integer.MIN_VALUE;

        for (int[] i : accounts) {
            int rowSum = 0;
            for (int j : i) {
                rowSum += j;
            }
            if (rowSum > max) {
                max = rowSum;
            }
        }
        return max;
    }
}