class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        c /= r;
        int[][] res = new int[r][c];
        int n1 = 0;
        int n2 = 0;
        for(int i = 0;i < mat.length;i++) {
            for(int j = 0;j < mat[0].length;j++) {
                if(n1 < r && n2 < c) {
                    res[n1][n2++] = mat[i][j];
                } else if(n1 < r) {
                    n2 = 0;
                    res[++n1][n2++] = mat[i][j];
                }
            }
        }
        return res;
    }
}