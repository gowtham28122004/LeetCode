class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> numCount = new HashMap<>();

        for (int num : nums) {
            numCount.put(num, numCount.getOrDefault(num, 0) + 1);
        }

        int longest = 0;

        for (int key : numCount.keySet()) {
            if (numCount.containsKey(key + 1)) {
                longest = Math.max(longest, numCount.get(key) + numCount.get(key + 1));
            }
        }

        return longest;
    }
}