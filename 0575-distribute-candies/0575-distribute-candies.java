class Solution {
    public int distributeCandies(int[] candyType) {
        int cr = candyType.length / 2;
        Set<Integer> set = new HashSet<>();
        for(int i : candyType) {
            set.add(i);
        }
        return cr < set.size()?cr:set.size();
    }
}