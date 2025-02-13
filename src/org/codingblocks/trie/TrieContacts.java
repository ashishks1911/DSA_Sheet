package org.codingblocks.trie;

import org.codingblocks.lec38.HashMap;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-contacts/problem
 */
public class TrieContacts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TrieContacts trie = new TrieContacts();
        for (int i = 0; i < n; i++) {
            String op = sc.next();
            String contact = sc.next();
            if(op.equals("add")){
                trie.insert(contact);
            }
            else{
                System.out.println(trie.find(contact));
            }
            System.out.println();
        }
    }

    class Node {
        char ch;
        HashMap<Character,Node> child = new HashMap<>();
        boolean isTerminal = false;
        int count = 1;

        public Node(char ch) {
            this.ch = ch;
        }

        public Node() {
        }
    }

    private Node root;

    public TrieContacts() {
        root = new Node('*');
    }

    public void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (curr.child.containsKey(ch)) {
                curr = curr.child.get(ch);
                curr.count++;
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

    public int find(String prefix){
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if (curr.child.containsKey(ch)) {
                curr = curr.child.get(ch);
            } else {
                return 0;
            }
        }
        return curr.count;
    }

}
