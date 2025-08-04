class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int time = 0;

        for(int i = 1; i < timeSeries.length; i++){
            int timeDiff = timeSeries[i] - timeSeries[i - 1];
            time += Math.min(timeDiff,duration);
        }

        return time + duration;
    }
}