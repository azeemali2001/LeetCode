class WordDictionary {
    
    private class Node {
        Node[] children;
        boolean isEnd;
        
        Node() {
            children = new Node[26];
            isEnd = false;
        }
        
        public boolean find(String word, int i) {
            if(i == word.length()) {
                return isEnd;
            }
            
            char ch = word.charAt(i);
            
            if(ch == '.') {
                for(Node child : children) {
                    if(child != null && child.find(word,i+1)) {
                        return true;
                    }
                }
            } else {
                if(children[ch-'a'] == null) {
                    return false;
                } else {
                    return children[ch-'a'].find(word,i+1);
                }
            }
            return false;
        }
        
    }

    final private Node root;
    
    public WordDictionary() {
        root = new Node();
    }
    
    public void addWord(String word) {
        Node curr = root;
        
        for(int i=0;i<word.length();i++) {
            char ch = word.charAt(i);
            
            if(curr.children[ch-'a'] == null) {
                curr.children[ch-'a'] = new Node();
            }
            
            curr = curr.children[ch-'a'];
        }
        
        curr.isEnd = true;
    }
    
    public boolean search(String word) {
        return root.find(word,0);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */