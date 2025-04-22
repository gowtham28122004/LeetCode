class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : stones) {
            pq.add(i);
        }
        while(pq.size()>1) {
            int i = pq.poll();
            int j = pq.poll();
            pq.add(i-j);
        }
        return pq.poll();
    }
}