class Solution {
    public int matrixSum(int[][] nums) {
        int score = 0;
        int[] arr = new int[nums.length];
        for(int i = 0;i < nums.length;i++) {
            Arrays.sort(nums[i]);
        }
        for(int i = 0;i < nums[0].length;i++) {
            int max = Integer.MIN_VALUE;
            for(int j = 0;j < nums.length;j++) {
                if(max < nums[j][i]) max = nums[j][i];
            }
            score += max;
        }
        return score;
    }
}