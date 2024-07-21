class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        
        List<int[]> points = new ArrayList<>();
        points.add(p1);
        points.add(p2);
        points.add(p3);
        points.add(p4);
        
        HashSet<Double> distances = new HashSet<>();
        
        for(int i = 0; i < points.size(); i++) {
            for(int j = i + 1; j < points.size(); j++) {
                double d = distance(points.get(i), points.get(j));
                if (d == 0) return false; 
                distances.add(d);
            }
        }
        
        return distances.size() == 2;
    }
    
    private double distance(int[] p1, int[] p2) {
        return Math.pow(p1[0] - p2[0], 2) + Math.pow(p1[1] - p2[1], 2);
    }
}
