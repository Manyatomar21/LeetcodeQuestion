class Solution {
    public String reorganizeString(String s) {
        int[] repetition= new int[26];
        for(char ch: s.toCharArray()){
            repetition[ch-'a']++;
        }
        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int i=0; i<26; i++){
            if(repetition[i]>0){
                pq.offer(new int[]{i, repetition[i]});
            }
        }
        StringBuilder result= new StringBuilder();
        int[] previous= null;
        while(!pq.isEmpty()){
            int[] actual= pq.poll();
            result.append((char)(actual[0]+'a'));
            actual[1]--;
            if(previous!=null && previous[1]>0){
                pq.offer(previous);
            }
            previous= actual;
        }
        if(result.length()!= s.length()){
            return "";
        }
        return result.toString();
    }
}