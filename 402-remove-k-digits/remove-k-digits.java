class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder stack= new StringBuilder();
        for(char value: num.toCharArray()){
            while(k>0 && stack.length()>0 && stack.charAt(stack.length()-1)>value){
                stack.deleteCharAt(stack.length()-1);
                k--;
            }
            stack.append(value);
        }
        while(k>0 && stack.length()>0){
            stack.deleteCharAt(stack.length()-1);
            k--;
        }
        int begin=0;
        while(begin<stack.length()&& stack.charAt(begin)=='0'){
            begin++;
        }
        if(begin==stack.length()){
            return "0";
        }
        return stack.substring(begin);
    }
}