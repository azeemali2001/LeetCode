class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for(String str : word1){
            sb.append(str);
        }
        
        
        for(String str : word2){
            sb2.append(str);
        }
        
        if(sb.toString().equals(sb2.toString())){
            return true;
        }
        return false;
    }
}