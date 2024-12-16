package org.codingblocks.trie;

import org.codingblocks.lec38.HashMap;

import java.util.List;

public class ReplaceWords {
    public static void main(String[] args) {

    }
    class Trie {
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

        public String replaceWord(String word) {
            Node curr = root;
            String replace = "";
            for (int i = 0; i < word.length(); i++) {
                if (curr.isTerminal){
                    return replace;
                }
                char ch = word.charAt(i);
                if (curr.child.containsKey(ch)) {
                    curr = curr.child.get(ch);
                    replace += ch;
                } else {
                    return word;
                }
            }
            return replace;
        }
    }

    public String replaceWords(List<String> dictionary, String sentence) {
        Trie trie = new Trie();
        for (String s : dictionary) {
            trie.insert(s);
        }
        String[] arr = sentence.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = trie.replaceWord(arr[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i] + " ");
        }
        return sb.toString().trim();
    }
}
