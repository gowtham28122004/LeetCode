class Solution {
    public int findContentChildren(int[] g, int[] s) {
        PriorityQueue<Integer> a = new PriorityQueue<>();
        PriorityQueue<Integer> b = new PriorityQueue<>();
        for(int i : g) {
            a.add(i);
        }
        for(int i : s) {
            b.add(i);
        }
        int c = 0;
        while(a.size() != 0 && b.size() != 0) {
            if(a.peek() <= b.peek()) {
                a.poll();
                b.poll();
                c++;
            }
            else {
                b.poll();
            }
        }
        return c;
    }
}