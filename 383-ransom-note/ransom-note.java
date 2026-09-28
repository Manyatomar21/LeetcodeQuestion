class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> occurrence= new HashMap<>();
        for(char actual: magazine.toCharArray()){
            occurrence.put(actual, occurrence.getOrDefault(actual,0)+1);
        }
        for(char actual: ransomNote.toCharArray()){
            if(!occurrence.containsKey(actual)|| occurrence.get(actual)==0){
                return false;
            }
            occurrence.put(actual, occurrence.get(actual)-1);
        }
        return true;
    }
}