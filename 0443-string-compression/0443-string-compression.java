class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int idx = 0;
        
        while(i < chars.length) {
            int j = i;
            
            char ch = chars[i];
            
            while(j < chars.length && chars[i] == chars[j]) j++;
            
            int len = j-i;
            
            chars[idx ++] = ch;
            
            if(len == 1) {
                
            } else if(len < 10) {
                chars[idx ++] = (char)(len+'0');
            } else {
                String fre = String.valueOf(len);
                for(char chFre : fre.toCharArray()) {
                    chars[idx++] = chFre;
                }
            }
            
            i = j;
        }
        
        return idx;
    }
}