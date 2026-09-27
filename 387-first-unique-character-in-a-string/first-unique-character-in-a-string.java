class Solution {
    public int firstUniqChar(String s) {
        int[] occurrence= new int[26];
        for(char actual: s.toCharArray()){
           occurrence[actual-'a']++;
        }
        for(int i=0; i<s.length(); i++){
            if(occurrence[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}