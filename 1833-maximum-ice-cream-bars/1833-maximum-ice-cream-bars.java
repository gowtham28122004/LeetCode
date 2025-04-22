import java.util.Arrays;

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        
        int count = 0;
        int totalCost = 0;
        
        for (int cost : costs) {
            if (totalCost + cost > coins) {
                break;
            }
            totalCost += cost;
            count++;
        }
        
        return count;
    }
}
