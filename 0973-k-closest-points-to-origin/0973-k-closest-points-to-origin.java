class Solution {
    
    public class Pair implements Comparable<Pair> {
        int x;
        int y;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
        
        public int compareTo(Pair o){
            return Integer.compare(distance(o),distance(this));
        }
    }
    
    public static int distance(Pair p){
        return (p.x*p.x)+(p.y*p.y);
    }
    
    public int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][2];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        for(int i=0;i<points.length;i++){
            int x = points[i][0];
            int y = points[i][1];
            Pair nPair = new Pair(x,y);
            
            int dis = distance(nPair);
            
            if(pq.size() < k){
                pq.add(nPair);
            } else {
                if(distance(pq.peek()) > dis){
                    pq.remove();
                    pq.add(nPair);
                }
            }
        }
        
        int i = 0;
        while(pq.size() != 0){
            Pair top = pq.remove();
            
            ans[i][0] = top.x;
            ans[i][1] = top.y;
            i++;
            
        }
        return ans;
    }
}