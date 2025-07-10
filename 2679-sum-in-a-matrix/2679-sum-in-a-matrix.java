class Solution {
    public int matrixSum(int[][] nums) {
        int score = 0;
        for(int i = 0;i < nums.length;i++) {
            Arrays.sort(nums[i]);
        }
        for(int i = 0;i < nums[0].length;i++) {
            int max = nums[0][i];
            for(int j = 1;j < nums.length;j++) {
                if(max < nums[j][i]) max = nums[j][i];
            }
            score += max;
        }
        return score;
    }
}