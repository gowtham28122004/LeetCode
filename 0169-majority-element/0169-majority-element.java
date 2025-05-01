class Solution {
    public int majorityElement(int[] nums) {
        int ans = nums[0];
        int ct = 1;
        for(int i = 1;i < nums.length;i++) {
            if(ct == 0) {
                ans = nums[i];
                ct++;
            }
            else if(ans == nums[i]) {
                ct++;
            }
            else {
                ct--;
            }
        }
        return ans;
    }
}