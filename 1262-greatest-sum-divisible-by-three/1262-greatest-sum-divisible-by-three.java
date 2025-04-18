class Solution {
    public int maxSumDivThree(int[] nums) {
        int[] dp = new int[3];
        for (int num : nums) {
            int[] current = dp.clone();
            for (int i = 0; i < 3; i++) {
                int sum = current[i] + num;
                dp[sum % 3] = Math.max(dp[sum % 3], sum);
            }
        }
        
        return dp[0];
    }
}
