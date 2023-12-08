class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)) return "";
        
        int gcd = GCD(str1.length(), str2.length());
        return str2.substring(0, gcd);
    }
    
    int GCD(int p, int q) {
        if(q == 0) return p;
        return GCD(q, p%q);
    }
    
}