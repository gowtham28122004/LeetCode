class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        
        for(int x: nums)
            xor ^= x;
        
        return xor;
    }
}