class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] letters= s.toCharArray();
        long sumOfShifts= 0;
        for(int i=shifts.length-1; i>=0; i--){
            sumOfShifts= (sumOfShifts + shifts[i])%26;
            int current= letters[i]-'a';
            int updated= (int)((current+sumOfShifts)%26);
            letters[i]= (char)('a'+updated);
        }
        return new String(letters);
    }
}