/*
    https://leetcode.com/problems/implement-trie-prefix-tree/
    208. Implement Trie (Prefix Tree) (Medium)
    14/05/2020
    May LeetCoding Challenge
    Day-14

    Data Structure - Array
    RunTime: 29 ms
    Memory: 48.8 MB
*/

class TrieNode {
    TrieNode child[] = new TrieNode[26];
    public boolean isEnd;
    public TrieNode(){
        this.isEnd = false;
    }
}

class Trie {
    TrieNode root;
    public Trie() {
        this.root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = this.root;
        int len = word.length();
        for(int i=0;i<len;i++){
            char ch = word.charAt(i);
            if(node.child[ch-'a']!=null){
                node = node.child[ch-'a'];
            } else {
                node.child[ch-'a'] = new TrieNode();
                node = node.child[ch-'a'];
            }
        }
        node.isEnd = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = this.root;
        int len = word.length();
        for(int i=0;i<len;i++){
            char ch = word.charAt(i);
            if(node.child[ch-'a']!=null){
                node = node.child[ch-'a'];
            } else {
                return false;
            }
        }
        return node.isEnd;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = this.root;
        int len = prefix.length();
        for(int i=0; i<len; i++){
            char ch = prefix.charAt(i);
            if(node.child[ch-'a']!=null){
                node = node.child[ch-'a'];
            } else {
                return false;
            }
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