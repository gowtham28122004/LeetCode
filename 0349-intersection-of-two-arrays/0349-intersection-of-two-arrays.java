class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        for(int i : nums1) {
            s.add(i);
        }
        Set<Integer> a = new HashSet<>();
        for(int i : nums2) {
            if(s.contains(i)) a.add(i);
        }
        return a.stream().mapToInt(Integer::intValue).toArray();
    }
}