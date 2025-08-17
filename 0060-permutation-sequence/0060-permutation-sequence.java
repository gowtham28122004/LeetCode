class Solution {
    public String getPermutation(int n, int k) {
        int fact = 1;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 1;i < n;i++) {
            fact = fact * i;
            al.add(i);
        }
        al.add(n);
        String ans = "";
        k = k - 1;
        while(true) {
            ans = ans + al.get(k / fact);
            al.remove(k / fact);
            if(al.size() == 0) {
                break;
            }
            k = k % fact;
            fact = fact / al.size();
        }
        return ans;
    }
}