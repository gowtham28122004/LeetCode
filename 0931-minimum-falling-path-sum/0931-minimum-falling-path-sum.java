class Solution {
    public int minFallingPathSum(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int n = matrix.length;
        
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                int min = matrix[i + 1][j];
                if (j > 0) {
                    min = Math.min(min, matrix[i + 1][j - 1]);
                }
                if (j < n - 1) {
                    min = Math.min(min, matrix[i + 1][j + 1]);
                }
                matrix[i][j] += min;
            }
        }

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            result = Math.min(result, matrix[0][i]);
        }
        
        return result;
    }
}
