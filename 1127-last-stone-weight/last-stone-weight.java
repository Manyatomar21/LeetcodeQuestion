class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones){
            pq.offer(stone);
        }
        while(pq.size()>1){
            int left= pq.poll();
            int right= pq.poll();
            if(left!=right){
                pq.offer(left-right);
            }
        }
        return pq.isEmpty() ? 0: pq.peek();
    }
}