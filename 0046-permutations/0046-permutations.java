class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();

        backtrack(resultList, new ArrayList<>(), nums);
        return resultList;
    }
    public void backtrack(List<List<Integer>> resultList,ArrayList<Integer> tempList,int[] nums) {
        if(tempList.size() == nums.length) {
            resultList.add(new ArrayList<>(tempList));
            return;
        }
        for(int n : nums) {
            if(tempList.contains(n)) continue;
            tempList.add(n);
            backtrack(resultList, tempList, nums);
            tempList.remove(tempList.size() - 1);
        }
    }
}