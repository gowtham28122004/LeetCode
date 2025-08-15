class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, count, new ArrayList<>(), nums.length);
        return result;
    }

    private void backtrack(List<List<Integer>> result, HashMap<Integer, Integer> count,
                           List<Integer> tempList, int n) {
        if (tempList.size() == n) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int num : count.keySet()) {
            if (count.get(num) > 0) {
                tempList.add(num);
                count.put(num, count.get(num) - 1);

                backtrack(result, count, tempList, n);

                tempList.remove(tempList.size() - 1);
                count.put(num, count.get(num) + 1);
            }
        }
    }
}
