class Solution {
    public int subarraySum(int[] nums, int k) {
        return countSubarrays(nums, k, 0);
    }

    private int countSubarrays(int[] nums, int k, int start) {
        if (start == nums.length) return 0;

        int count = 0, sum = 0;

        for (int end = start; end < nums.length; end++) {
            sum += nums[end];
            if (sum == k) count++;
        }

        return count + countSubarrays(nums, k, start + 1);
    }
}
