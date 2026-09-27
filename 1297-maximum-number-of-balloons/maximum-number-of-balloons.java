class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> occurrence= new HashMap<>();
        for(char actual:text.toCharArray()){
            occurrence.put(actual, occurrence.getOrDefault(actual,0)+1);
        }
        int b= occurrence.getOrDefault('b',0);
        int a= occurrence.getOrDefault('a',0);
        int l= occurrence.getOrDefault('l',0)/2;
        int o= occurrence.getOrDefault('o',0)/2;
        int n= occurrence.getOrDefault('n',0);
    
    return Math.min(Math.min(b,a), Math.min(Math.min(l,o),n));
}
}