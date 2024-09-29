class Solution {
    public boolean isPowerOfTwo(int n) {
        double t = Math.log10(n) / Math.log10(2);
        return (t - (int)t) == 0;
    }
}