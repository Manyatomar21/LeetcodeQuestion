class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> occurrence= new HashMap<>();
        for(char actual: s.toCharArray()){
            occurrence.put(actual, occurrence.getOrDefault(actual,0)+1);
        }
        int result=0;
        boolean hasOdd= false;
        for(int value: occurrence.values()){
            result+= (value/2)*2;
            if(value%2==1){
                hasOdd= true;
            }
        }
        if(hasOdd){
            result++;
        }
        return result;
    }
}