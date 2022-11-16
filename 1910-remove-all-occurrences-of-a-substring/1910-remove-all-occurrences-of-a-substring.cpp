class Solution {
public:
    bool check(stack<int> st,string& part){
        if(st.size()<part.size()) return false;
        string temp;
        while(temp.size()<part.size()) {
            temp.push_back(st.top());
            st.pop();
        }
        reverse(temp.begin(),temp.end());
        return temp==part;
    }
    string removeOccurrences(string s, string part) {
        stack<int> st;
        for(int i=0; i<s.size(); ++i){
            st.push(s[i]);
            while(st.size()>0 && st.top()==part[part.size()-1] && check(st,part)) {
                int temp = part.size();
                while(temp--) st.pop();
            }
        }
        string ans;
        while(!st.empty()) {
            ans.push_back(st.top());
            st.pop();
        }
        reverse(ans.begin(),ans.end());
        return ans;
    }
};