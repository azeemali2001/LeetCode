class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        
        int farr[] = new int[score.length];
        
        for(int i=0;i<letters.length;i++) {
            char ch = letters[i];
            farr[ch-'a']++;
        }
        
        return solution(words, farr, score, 0);
    }
    
    public int solution(String[] words, int[] farr, int[]score, int idx) {
        if(idx == words.length) {
	        return 0;
	    }
		
		//No Call
		int noCall = 0+solution(words, farr, score, idx+1);
		
		//Yes Call
		//Checking its frequency
		
		String str = words[idx];
		boolean flag = true;
		int scoreOfWord = 0;
		
		for(int i=0;i<str.length();i++) {
		    char ch = str.charAt(i);
		    
            
		    if(farr[ch-'a'] == 0) {
		        flag = false;
		    } 
		    
		    farr[ch-'a'] --;
		    scoreOfWord += score[ch-'a'];
		}
		
		int yesCall =0;
		if(flag) {
		    yesCall = scoreOfWord + solution(words, farr, score, idx+1);
		}
		
		
		for(int i=0;i<str.length();i++) {
		    char ch = str.charAt(i);
		    
		    farr[ch-'a']++;
		}
		
		return Math.max(noCall, yesCall);
        
        
    }
}