class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] repetition= new int[26];
        for(char task:tasks){
            repetition[task-'A']++;
        }
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int value:repetition){
            if(value>0){
                pq.offer(value);
            }
        }
        int intervals=0;
        while(!pq.isEmpty()){
            List<Integer> leftover= new ArrayList<>();
            int cycle= n+1;
            while(cycle>0 && !pq.isEmpty()){
                int value= pq.poll();
                if(value>1){
                    leftover.add(value-1);
                }
                intervals++;
                cycle--;
            }
            for(int value: leftover){
                pq.offer(value);
            }
            if(pq.isEmpty()){
                break;
            }
            intervals+=cycle;
        }
        return intervals;
    }
}