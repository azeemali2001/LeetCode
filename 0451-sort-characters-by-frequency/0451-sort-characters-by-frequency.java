class Solution {
    public class Pair implements Comparable<Pair>{
        char ch;
        int count;
        Pair(char ch,int count){
            this.ch = ch;
            this.count = count;
        }
        
        public int compareTo(Pair o){
            return o.count - this.count;
        }
    }
    
    
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        PriorityQueue <Pair> pq = new PriorityQueue<>();
        HashMap<Character,Integer> hm = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            } else {
                hm.put(ch,1);
            }
        }
        
        for(Character ch : hm.keySet()){
            int fre = hm.get(ch);
            pq.add(new Pair(ch,fre));
        }
        
        

        int size = pq.size();
        for(int i=0;i<size;i++){
            Pair top  = pq.remove();
            int t = top.count;
            for(int j=0;j<t;j++){
                sb.append(top.ch);
            }
        }
        return sb.toString();
    }
}