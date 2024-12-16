package org.codingblocks.trie;

import org.codingblocks.lec38.HashMap;

public class Trie {
    class Node {
        char ch;
        HashMap<Character, Node> child = new HashMap<>();
        boolean isTerminal = false;

        public Node(char ch) {
            this.ch = ch;
        }

        public Node() {
        }
    }

    private Node root;

    public Trie() {
        root = new Node('*');
    }

    public void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (curr.child.containsKey(ch)) {
                curr = curr.child.get(ch);
            } else {
                Node nn = new Node(ch);
                curr.child.put(ch, nn);
                curr = nn;
            }
        }
        curr.isTerminal = true;
    }

    public boolean search(String word){
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (curr.child.containsKey(ch)) {
                curr = curr.child.get(ch);
            } else {
                return false;
            }
        }
        return curr.isTerminal;
    }

    public boolean startsWith(String prefix){
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if (curr.child.containsKey(ch)) {
                curr = curr.child.get(ch);
            } else {
                return false;
            }
        }
        return true;
    }

}
