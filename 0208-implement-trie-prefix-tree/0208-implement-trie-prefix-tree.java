class Node{
    char ch;
    int count;
    boolean isEnd;
    HashMap<Character,Node> children;
    
    Node(char ch){
        this.ch = ch;
        isEnd = false;
        children = new HashMap<>();
    }
    
    boolean hasChild(char ch){
        return this.children.containsKey(ch);
    }
    
    Node getNode(char ch){
        return this.children.get(ch);
    }
    
    Node createNode(char ch){
        Node node = new Node(ch);
        this.children.put(ch,node);
        return node;
    }
    
    void markTrue(){
        this.isEnd = true;
    }
    
    boolean isEndOfWord(){
        return this.isEnd;
    }
    
    int changeCount(int v){
        return this.count = v;
    }
    
    int getCount(){
        return this.count;
    }
}

class Trie {
    
    Node root;

    public Trie() {
        root = new Node('-');
    }
    
    public void insert(String word) {
        Node ptr = root;
        
        
        
        for(int i=0;i<word.length();i++){
            
            
            char ch = word.charAt(i);
            if(ptr.hasChild(ch)){
                ptr = ptr.getNode(ch);
            } else {
                ptr = ptr.createNode(ch);
            }
            ptr.changeCount(ptr.getCount()+1);
            
        }
        ptr.markTrue();
    }
    
    public boolean search(String word) {
        Node ptr = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ptr.hasChild(ch)){
                ptr = ptr.getNode(ch);
            } else {
                return false;
            }
        }
        
        return ptr.isEndOfWord();
    }
    
    public boolean startsWith(String prefix) {
        
        Node ptr = root;
        
        for(int i=0;i<prefix.length();i++){
            char ch = prefix.charAt(i);
            if(ptr.hasChild(ch)){
                ptr = ptr.getNode(ch);
            } else {
                return false;
            }
        }
        return ptr.getCount() > 0;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */