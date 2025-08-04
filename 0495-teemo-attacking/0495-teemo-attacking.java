class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int res = duration;
        for(int i = 0;i < timeSeries.length;i++) {
            if(duration > timeSeries[i]) {
                res++;
            } else if(res < timeSeries[i]) {
                res = timeSeries[i];
            }
        }
        return res;
    }
}