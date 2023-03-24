class Solution {
    public int findTheWinner(int n, int k) {
        return solve(n, k)+1;
        
    }
    
    public int solve(int n, int k) {
        if(n==1) {
            return 0;
        }
        
        int x = solve(n-1, k);
        int y = (x + k) % n;
        
        return y;
    }
}

// class Solution {
// public:
//     int findAns(int n,int k){
//         if(n==1)return 0;
//         else
//         return (findAns(n-1,k)+k)%n;
//     }
//     int findTheWinner(int n, int k) {
//         return findAns(n,k)+1;
        
//     }
// };