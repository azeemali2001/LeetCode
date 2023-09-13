class Solution {
    
    static class Pair {
        char ch;
        int count;
        
        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }
    
    public String longestDiverseString(int a, int b, int c) {
        
        StringBuilder sb = new StringBuilder();
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y)->y.count - x.count);
        
        if(a > 0) {
            pq.add(new Pair('a', a));
        }
        
        if(b > 0) {
            pq.add(new Pair('b', b));
        }
        
        if(c > 0) {
            pq.add(new Pair('c', c));
        }
        
        
        sb.append("dd");
        
        while(pq.size() != 0) {
            
            Pair top = pq.remove();
            
            if(top.ch == sb.charAt(sb.length()-1) && top.ch == sb.charAt(sb.length()-2)) {
                
                if(pq.size() == 0) break;
                
                Pair next = pq.remove();
                
                sb.append(next.ch);
                
                if(next.count > 1) {
                    next.count --;
                    pq.add(next);
                }
                
                pq.add(top);
            } else {
                sb.append(top.ch);
                
                if(top.count > 1) {
                    top.count --;
                    
                    pq.add(top);
                }
            }
        }
        
        return sb.substring(2);
    }
}