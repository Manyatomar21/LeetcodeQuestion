class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> characters = new Stack<>();
        Stack<Integer> counts = new Stack<>();

        for (char actual : s.toCharArray()) {
            if(!characters.isEmpty()&& characters.peek()==actual){
                int count= counts.pop()+1;
                if(count==k){
                    characters.pop();
                } else{
                    counts.push(count);
                }
            } else{
                characters.push(actual);
                counts.push(1);
            }
        }
        StringBuilder result= new StringBuilder();
        for(int i=0; i<characters.size(); i++){
            int count= counts.get(i);
            while(count-->0){
                result.append(characters.get(i));
            }
        }
        return result.toString();
    }
}

            