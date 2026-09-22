class Solution {
    public String removeDuplicates(String s) {
    StringBuilder output= new StringBuilder();
        for(char ch: s.toCharArray()){
            int n= output.length();
            if(n>0 && output.charAt(n-1)==ch){
                output.deleteCharAt(n-1);
            } else{
                output.append(ch);
            }
        }
        return output.toString();
    }
}