class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            if (Math.abs(curr) < Math.abs(closest) || 
               (Math.abs(curr) == Math.abs(closest) && curr > closest)) {
                closest = curr;
            }
        }

        return closest;
    }
}
