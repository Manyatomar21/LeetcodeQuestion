class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days= {31,28,31,30,31,30,31,31,30,31,30,31};
        int a1= change(arriveAlice,days);
        int a2= change(leaveAlice,days);
        int b1= change(arriveBob,days);
        int b2=change(leaveBob,days);
        int begin= Math.max(a1,b1);
        int end= Math.min(a2,b2);
        return Math.max(0, end-begin+1);
    }
    private int change(String date, int[] days){
        int month= Integer.parseInt(date.substring(0,2));
        int day= Integer.parseInt(date.substring(3,5));
        int total= day;
        for(int i=0; i<month-1; i++){
            total+= days[i];
        }
        return total;
    }
}