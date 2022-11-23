class Solution {
    
    public static void solve(char[] arr, int i,int j){
        if(arr[i] == 'L' && arr[j] == 'R') {
            //Nothing to do
        } else if(arr[i] == 'R' && arr[j] == 'L') {
            i++;
            j--;
            while(i<j){
                arr[i] = 'R';
                arr[j] = 'L';
                i++;
                j--;
            }
        } else if(arr[i] == 'L' && arr[j] == 'L') {
            for(int k=i+1;k<j;k++){
                arr[k] = 'L';
            }
        } else if(arr[i] == 'R' && arr[j] == 'R') { 
            for(int k=i+1;k<j;k++){
                arr[k] = 'R';
            }
        }
    }
    
    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        char[] arr = new char[n+2];
        arr[0] = 'L';
        arr[n+1] = 'R';
        
        for(int i=0;i<dominoes.length();i++){
            arr[i+1] = dominoes.charAt(i);
        }
        
        
        int i = 0;
        int j = 1;
        
        while(j<arr.length){
            while(arr[j] == '.'){
                j++;
            }
            
            if(j-i > 1)
                solve(arr,i,j);
            
            i = j;
            j ++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int a=1;a<arr.length-1;a++){
            sb.append(arr[a]);
        }
        
        return sb.toString();
    }
}