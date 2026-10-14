class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> fuelHeap= new PriorityQueue<>(Collections.reverseOrder());
        int actualFuel= startFuel;
        int actualPosition=0;
        int stops=0;
        int stationIndex=0;
        while(actualFuel<target-actualPosition){
            while(stationIndex< stations.length && stations[stationIndex][0]<= actualPosition+ actualFuel){
                fuelHeap.offer(stations[stationIndex][1]);
                stationIndex++;
            }
            if(fuelHeap.isEmpty()){
                return -1;
            }
            actualFuel+= fuelHeap.poll();
            stops++;
        }
        return stops;
    }
}