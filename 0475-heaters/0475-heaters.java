class Solution {
    
    public static class Pair {
        int js;
        int jl;
        Pair(){
            js = -1;
            jl = -1;
        }
        
        Pair(int js, int jl){
            this.js = js;
            this.jl = jl;
        }
    }
    
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        
        int ans = 0;
        
        for(int i=0;i<houses.length;i++){
            int hp = houses[i];
            Pair p = ceilFloor(hp,heaters);
            
            int d1 = p.js == -1 ? Integer.MAX_VALUE : hp-p.js;
            int d2 = p.jl == -1 ? Integer.MAX_VALUE : p.jl-hp;
            
            int dif = Math.min(d1,d2);
            
            if(dif > ans){
                ans = dif;
            }
        }
        
        return ans;
    }
    
    public static Pair ceilFloor(int key, int[] arr){
        Pair p = new Pair();
        int lo = 0;
        int hi = arr.length-1;
        
        while(lo <= hi){
            int mid = (lo+hi)/2;
            
            if(arr[mid] == key){
                p.js = arr[mid];
                p.jl = arr[mid];
                return p;
            } else if(arr[mid] > key){
                p.jl = arr[mid];
                hi = mid-1;
            } else {
                p.js = arr[mid];
                lo = mid+1;
            }
        }
        return p;
    }
}