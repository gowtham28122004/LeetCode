class Solution {
    public String thousandSeparator(int n) {
        if (n < 1000) 
            return Integer.toString(n);
        
        String result = "";
        int total = 0;
        
        while(n > 0)
        {
            int last = n % 10;
            n= n / 10;
            
            result = last + result;
            total++;
            
            if(total == 3 && n > 0 )
            {
                result = "." + result;
                total = 0;
            }
        }
        return result;
    }
}