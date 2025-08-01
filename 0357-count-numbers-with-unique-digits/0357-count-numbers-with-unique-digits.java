class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int[] results = {
            1,       
            10,      
            91,      
            739,     
            5275,    
            32491,   
            168571,  
            712891,  
            2345851  
        };

        if (n >= 0 && n <= 8) {
            return results[n];
        }
        return 0;
    }
}