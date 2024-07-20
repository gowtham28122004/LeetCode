class Solution {
    public int passThePillow(int n, int time) {
        
        int R = time % (2*n - 2);
        
        if(R <= n - 1)
            return R + 1;
        else
            return (2*n - 2 - R + 1);
        
    }
}