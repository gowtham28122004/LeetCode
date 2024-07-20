public class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < 1024; i++) { 
            int hour = i >> 6; 
            int minute = i & 63; 
            
            if (hour > 11 || minute > 59) continue; 
            
            if (Integer.bitCount(i) == turnedOn) {
                result.add(String.format("%d:%02d", hour, minute)); 
            }
        }
        return result;
    }
}
