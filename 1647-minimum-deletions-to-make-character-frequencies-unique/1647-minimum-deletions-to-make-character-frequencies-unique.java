class Solution {
    public int minDeletions(String s) {
        int[] arr = new int[26];
        
        for(int i=0;i<s.length();i++) {
            arr[s.charAt(i) - 'a']++;
        }
        
        HashSet<Integer> hs = new HashSet<>();
        int ans = 0;
        for(int i=0;i<26;i++) {
            int fre = arr[i];
            
            while(fre > 0 ) {
                if(!hs.contains(fre)) {
                    hs.add(fre);
                    break;
                }
                
                fre--;
                ans++;
            }
        }
        
        return ans;
    }
}