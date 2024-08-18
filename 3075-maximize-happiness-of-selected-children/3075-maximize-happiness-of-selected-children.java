class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        
        Arrays.sort(happiness);
        
        int turn = 0;
        long ans = 0;
        
        for(int i = happiness.length - 1;i >= 0;i--)
        {
            ans += (happiness[i] - turn >= 0 ? happiness[i] - turn : 0);
            turn += 1;
            if(turn == k) break;
        }
        
        return ans;
    }
}