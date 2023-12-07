class Solution {
    public String largestOddNumber(String num) {
        int i = num.length()-1;
        while(i>=0) {
            if(num.charAt(i) == '0' || num.charAt(i) == '2' ||num.charAt(i) == '4' ||num.charAt(i) == '6' ||num.charAt(i) == '8') {
                i--;
            } else {
                break;
            }
        }
        
        return num.substring(0, i+1);
    }
}