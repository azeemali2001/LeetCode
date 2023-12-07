class Solution {
    public String largestOddNumber(String num) {
        int i = num.length()-1;
        while(i>=0) {
            int val = num.charAt(i);
            if(val % 2 == 1) return num.substring(0, i+1);
            i--;
        }
        
        return "";
    }
}