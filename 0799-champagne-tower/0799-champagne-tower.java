class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        
        double[][] dp = new double[101][101];
        dp[0][0] = poured;
        
        for(int i = 0; i < query_row; i++) {
            for(int j = 0; j <= i; j++) {
                if(dp[i][j] >= 1) {
                    double overflow = (dp[i][j] - 1.0);
                    double split = overflow / 2.0;
                    
                    dp[i+1][j] += split;
                    dp[i+1][j+1] += split;
                    dp[i][j] = 1.0;
                }
            }
        }
        return Math.min(1.0, dp[query_row][query_glass]);
    }
}
