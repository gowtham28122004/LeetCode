class Solution {
    public int missingNumber(int[] nums) {
        
        int N = nums.length;
        int M = N * (N + 1) / 2;
        int O = 0;
        
        for(int i = 0; i < nums.length; i++ )
            O += nums[i];
        
        return M - O;
    }
}