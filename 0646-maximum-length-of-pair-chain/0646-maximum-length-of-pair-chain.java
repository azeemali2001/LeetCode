class Solution {
    public int findLongestChain(int[][] pairs) {
        
        Arrays.sort(pairs, (a, b) -> {
            if(a[1] == b[1]) {
                return Integer.compare(a[0],b[0]);
            } else {
                return Integer.compare(a[1],b[1]);
            }
        });
        
        
        int ans = 1;
        int curr = pairs[0][1];
        
        for(int i=1;i<pairs.length;i++) {
            if(curr < pairs[i][0]) {
                curr = pairs[i][1];
                ans ++;
            }
        }
        
        return ans;
        
    }
}