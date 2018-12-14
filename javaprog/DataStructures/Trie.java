package DataStructures;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    
    private static class TrieNode
    {
        public Map<Character, TrieNode> next;
        public boolean endOfWord;
        public TrieNode()
        {
            this.next=new HashMap<>();
            this.endOfWord=false;
        }
    }
    
    private TrieNode root;
    public Trie()
    {
        root=new TrieNode();
    }
    public void insert(String word) {
        int l=word.length();
        int i;
        TrieNode curr=root;
        for(i=0; i<l; i++)
        {
            char ch=word.charAt(i);
            TrieNode node=curr.next.get(ch);
            if(node==null)
            {
                node=new TrieNode();
                curr.next.put(ch, node);
            }
            curr=node;
        }
        curr.endOfWord=true;
    }
    
    public boolean search(String word)
    {
        TrieNode curr=root;
        int i;
        for(i=0; i<word.length(); i++)
        {
            char ch=word.charAt(i);
            TrieNode node=curr.next.get(ch);
            if(node==null)
            {
                return false;
            }
            curr=node;
        }
        return curr.endOfWord;
    }
    
        /**
     * Delete word from trie.
     */
    public void delete(String word) {
        delete(root, word, 0);
    }

    /**
     * Returns true if parent should delete the mapping
     */
    private boolean delete(TrieNode current, String word, int index) {
        if (index == word.length()) {
            //when end of word is reached only delete if currrent.endOfWord is true.
            if (!current.endOfWord) {
                return false;
            }
            current.endOfWord = false;
            //if current has no other mapping then return true
            return current.next.size() == 0;
        }
        char ch = word.charAt(index);
        TrieNode node = current.next.get(ch);
        if (node == null) {
            return false;
        }
        boolean shouldDeleteCurrentNode = delete(node, word, index + 1);

        //if true is returned then delete the mapping of character and trienode reference from map.
        if (shouldDeleteCurrentNode) {
            current.next.remove(ch);
            //return true if no mappings are left in the map.
            return current.next.size() == 0;
        }
        return false;
    }
    
    public void printDict()
    {
        StringBuilder s = new StringBuilder();
        printDictUtil(root, s);
    }
    
    private void printDictUtil(TrieNode root, StringBuilder sw) {
        if(root.endOfWord==true)
        {
            System.out.print(sw.toString()+"$");
            return;
        }
        TrieNode curr=root;
        int len=0;
        if(curr.next.containsKey('0'))
        {
            len=sw.length();
            sw.append("0 ");
            TrieNode node=curr.next.get('0');
            printDictUtil(node, sw);
            sw.replace(len, len+2, "");
        }
        if(curr.next.containsKey('1'))
        {
            len=sw.length();
            sw.append("1 ");
            TrieNode node=curr.next.get('1');
            printDictUtil(node, sw);
            sw.replace(len, len+2, "");
        }
        return;
    }
    
    public static void main(String[] args) {
        Trie t=new Trie();
        //t.insert("sba");
        //t.insert("absfc");
        //t.insert("absfb");
        //t.insert("antin");
        t.insert("1101");
        t.insert("1001");
        t.insert("1101");
        t.printDict();
//        System.out.println(""+t.search("absfc")+" "+t.search("antin")+" "+t.search("absfb")+" "+t.search("ant"));
//        t.delete("absfc");
//        t.delete("antin");
//        t.delete("ant");
//        t.delete("absfb");
//        t.printDict();
//        System.out.println(""+t.search("absfc")+" "+t.search("antin")+" "+t.search("absfb")+" "+t.search("ant"));
        
    }
}
