class Trie {
    class TrieNode{
        TrieNode[] children;
        boolean isEnd;
        public TrieNode(){
            // create new node
            children = new TrieNode[26];
        }
    }
    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        // assign root to current node

        TrieNode curr = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);

            if(curr.children[c - 'a'] == null){
                curr.children[c - 'a'] = new TrieNode();
            }
            curr = curr.children[c - 'a'];
        }
        curr.isEnd = true;
    }

    public boolean search(String word) {
        // assign root to current node

        TrieNode curr = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);

            if(curr.children[c - 'a'] == null){
                return false;
            }
            curr = curr.children[c - 'a'];
        }
        return curr.isEnd;
    }

    public boolean startsWith(String prefix) {
        // assign root to current node

        TrieNode curr = root;
        for(int i = 0; i < prefix.length(); i++){
            char c = prefix.charAt(i);

            if(curr.children[c - 'a'] == null){
                return false;
            }
            curr = curr.children[c - 'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */