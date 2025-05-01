class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> li = new ArrayList<Integer>();
        int num1 = Integer.MIN_VALUE;
        int num2 = Integer.MIN_VALUE;
        int ct1 = 0;
        int ct2 = 0;
        for(int i = 0;i < nums.length;i++) {
            if(ct1 == 0 && nums[i] != num2) {
                num1 = nums[i];
                ct1++;
            }
            else if(ct2 == 0 && nums[i] != num1) {
                num2 = nums[i];
                ct2++;
            }
            else if(nums[i] == num1) ct1++;
            else if(nums[i] == num2) ct2++;
            else{
                ct1--;
                ct2--;
            }            
        }
        ct1 = 0;
        ct2 = 0;
        for(int i = 0;i < nums.length;i++) {
            if(nums[i] == num1) ct1++;
            if(nums[i] == num2) ct2++;
        }
        if(ct1 > (int)nums.length/3) li.add(num1);
        if(ct2 > (int)nums.length/3) li.add(num2);
        Collections.sort(li);
        return li;
    }
}