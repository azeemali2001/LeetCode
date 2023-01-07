class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int Tgas = 0;
        int Tcost = 0;

        for(int i=0;i<gas.length;i++){
            Tgas += gas[i];
            Tcost += cost[i];
        }

        if( Tgas < Tcost) return -1;

        int idx = 0;
        int curr = 0;
        for(int i=0;i<gas.length;i++){
            curr += (gas[i]-cost[i]);
            if(curr < 0){
                idx = i+1;
                curr = 0;
            }
        }

        return idx;
    }
}