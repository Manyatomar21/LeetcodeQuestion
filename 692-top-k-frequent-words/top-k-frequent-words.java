class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> repetition= new HashMap<>();
        for(String word:words){
            repetition.put(word, repetition.getOrDefault(word,0)+1);
        }
        PriorityQueue<String> pq= new PriorityQueue<>((a,b)->{
            if(repetition.get(a).equals(repetition.get(b))){
                return b.compareTo(a);
            }
            return repetition.get(a)- repetition.get(b);
        });
        for(String word: repetition.keySet()){
            pq.offer(word);
            if(pq.size()>k){
                pq.poll();
            }
        }
        List<String> result= new ArrayList<>();
        while(!pq.isEmpty()){
            result.add(pq.poll());
        }
        Collections.reverse(result);
        return result;
    }
}