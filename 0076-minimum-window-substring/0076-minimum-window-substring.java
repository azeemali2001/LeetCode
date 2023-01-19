class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> hm2 = new HashMap<>();
        
        for(int i=0;i<t.length();i++) {
            char ch = t.charAt(i);
            hm2.put(ch,hm2.getOrDefault(ch,0)+1);
        }
        
        
        HashMap<Character,Integer> hm1 = new HashMap<>();
        String ans = "";
        
        int mct = 0;                    //Match count
        int dmc = t.length();           //Desired Match count
        
        int i = -1;
        int j = -1;
        
        while(true) {
            
            boolean flag1 = false;
            boolean flag2 = false;
            
            //Acquire
            while(i<s.length()-1 && mct < dmc) {
                i++;
                char ch = s.charAt(i);
                hm1.put(ch,hm1.getOrDefault(ch,0)+1);
                
                if(hm1.getOrDefault(ch,0) <= hm2.getOrDefault(ch,0)) {
                    mct++;
                }
                flag1 = true;
            }
            
            // collect answer and release
            while(j<i && mct == dmc) {
                //collect answer
                String pans = s.substring(j+1,i+1);
                if(ans.length() == 0 || pans.length() < ans.length()) {
                    ans = pans;
                }
                
                // release
                j++;
                char ch = s.charAt(j);
                if(hm1.get(ch) == 1) {
                    hm1.remove(ch);
                } else {
                    hm1.put(ch,hm1.get(ch)-1);
                }
                
                if(hm1.getOrDefault(ch,0) < hm2.getOrDefault(ch,0)) {
                    mct--;
                }
                
                flag2 = true;
            }
            
            if(flag1 == false && flag2 == false) {
                break;
            }
        }
        return ans;
    }
}