class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        int n = num1.length();
        int m = num2.length();
        int[] ans = new int[n+m];
        
        //Pointers
        int i = m-1;
        int j = n-1;
        int pf = 0;                 //Power Factor
        int k = ans.length-1-pf;
        
        while(i>=0){
            int ival = i<0 ? 0 : num2.charAt(i)-'0';
            i--;
            int carry = 0;
            j=n-1;
            
            while(j>=0 || carry != 0){
                int jval = j<0 ? 0 : num1.charAt(j)-'0';
                j--;
                int pro = (ival * jval) + carry + ans[k];
                ans[k] = pro % 10;
                carry = pro /10;
                k--;
            }
            pf ++;
            k = ans.length-1-pf;
        }
        
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        for(int a=0;a<ans.length;a++){
            if(ans[a] == 0 && flag == true){
                continue;
            } else {
                flag = false;
                sb.append(ans[a]);
            }
        }
        
        return sb.toString();
    }
}