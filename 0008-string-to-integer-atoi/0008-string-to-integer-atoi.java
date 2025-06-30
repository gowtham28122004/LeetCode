class Solution {
    public int myAtoi(String s) {
        if(s.isEmpty()){
            return 0;
        }
        String s1 = s.trim();
        if(s1.isEmpty()){
            return 0;
        }
        int i = 0;
        int len = s1.length();
        boolean isNegative = false;
        if(s1.charAt(0) == '-'){
            isNegative = true;
            i++;
        } else if(s1.charAt(0) == '+') {
            i++;
        }
        long res = 0;
        while(i < len && Character.isDigit(s1.charAt(i))){
            res = res * 10 + (s1.charAt(i) - '0');
            i++;

            if(!isNegative && res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(isNegative && -res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        if(isNegative){
            return (int) -res;
        }
        return (int) res;
    }
}