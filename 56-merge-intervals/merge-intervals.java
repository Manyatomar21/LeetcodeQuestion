class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> a[0]- b[0]);
        ArrayList<int[]> mergedIntervals= new ArrayList<>();
        int start= intervals[0][0];
        int end= intervals[0][1];
        for(int i=0; i<intervals.length; i++){
            int nextStart= intervals[i][0];
            int nextEnd= intervals[i][1];
            if(nextStart<=end){
                end= Math.max(end, nextEnd);
            } 
            else{
                mergedIntervals.add(new int[]{start,end});
                start= nextStart;
                end= nextEnd;
            }
        }
            mergedIntervals.add(new int[]{start,end});
            return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
        }
    }
