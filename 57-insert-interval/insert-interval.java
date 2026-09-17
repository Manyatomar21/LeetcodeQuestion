class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> answer= new ArrayList<>();
        int start= newInterval[0];
        int end= newInterval[1];
        int i=0;
        while(i<intervals.length && intervals[i][1]<start){
            answer.add(intervals[i]);
            i++;
        }
        while(i<intervals.length && intervals[i][0]<=end){
            start= Math.min(start, intervals[i][0]);
            end= Math.max(end, intervals[i][1]);
            i++;
        }
        answer.add(new int[]{start, end});
        while(i<intervals.length){
            answer.add(intervals[i]);
            i++;
        }
        return answer.toArray(new int[answer.size()][]);
    }
}