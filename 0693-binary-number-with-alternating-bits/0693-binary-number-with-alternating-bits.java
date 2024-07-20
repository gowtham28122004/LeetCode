class Solution {
    public boolean hasAlternatingBits(int n) {
        int m = n ^ (n>>1);
        
        return (((m +1) & m) == 0);
        
    }
}