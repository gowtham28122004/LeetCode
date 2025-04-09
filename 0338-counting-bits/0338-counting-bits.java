class Solution {
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        int i = n;
        while(i >= 0){
            int x = 0;
            int t = i;
            while(t != 0){
                x += t % 2;
                t >>= 1;
            }
            arr[i] = x;
            i--;
        }
        return arr;
    }
}