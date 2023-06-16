class Solution {
public:
    vector<string> ans;
    void solve(string s,int i,int n) {
        if(i==n) {
            int c = 0;
            for(auto i: s){
                if(i=='(') ++c;
                else --c;
                if(c<0) return;
            }
            if(c==0) ans.push_back(s);
            return;
        }
        s.push_back('(');
        solve(s,i+1,n);
        s.pop_back();
        s.push_back(')');
        solve(s,i+1,n);
    }
    vector<string> generateParenthesis(int n) {
        ans.clear();
        solve("",0,2*n);
        return ans;
    }
};