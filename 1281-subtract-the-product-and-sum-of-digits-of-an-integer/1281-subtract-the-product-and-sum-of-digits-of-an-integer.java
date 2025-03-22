class Solution {
    public int subtractProductAndSum(int n) {
        int i = 1;
        int j = 0;
        while(n > 0){
            i *= n%10;
            j += n%10;
            n /= 10;
        }
        return i-j;
    }
}