class Solution {
    public String reverseWords(String s) {
        ArrayList<String> arr = new ArrayList<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(ch == ' '){
                
            } else {
                StringBuilder a = new StringBuilder();
                while(i!= s.length() && s.charAt(i) != ' '){
                    a.append(s.charAt(i));
                    i++;
                }
                arr.add(a.toString());
            }
        }
        
        
        int i=0;
        int j=arr.size()-1;
        
        while(i<j){
            String tem = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,tem);
            i++;
            j--;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int a=0;a<arr.size();a++){
            if(a==arr.size()-1){
                sb.append(arr.get(a));
            } else {
                sb.append(arr.get(a)+" ");
            }
        }
        
        return sb.toString();
    }
}