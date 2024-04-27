class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        
        int ssf = 0;
        int count = 0;
        unordered_map<int, int> map;
        map[0] = 1;
        
        for(int val : nums)
        {
            ssf += val;
                
            if(map.find(ssf - k) != map.end())
            {
                count += map[ssf - k];
            }
            
            if(map.find(ssf) != map.end())
            {
                map[ssf] = map[ssf] + 1;
            }
            else
            {
                map[ssf] = 1;
            }
        }
        
        return count;
    }
};