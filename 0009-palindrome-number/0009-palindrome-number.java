class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int temp=0;
        int rev = x;
        while (rev>0){
            temp = (temp*10) + (rev%10);
            rev /= 10; 
        }
        return (temp==x);
    }
}