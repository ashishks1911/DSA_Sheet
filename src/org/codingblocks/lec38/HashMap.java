package org.codingblocks.lec38;

import java.util.ArrayList;

public class HashMap<K, V> {
    class Node {
        K key;
        V value;
        Node next;
    }

    private ArrayList<Node> buckt = new ArrayList<>();
    private int size = 0;

    public HashMap(int n) {
        for (int i = 0; i < n; i++) {
            buckt.add(null);
        }
    }

    public HashMap() {
        this(4);
    }

    public void put(K key, V value) {
        int idx = hashFun(key);
        Node nn = buckt.get(idx);
        while (nn != null) {
            if (nn.key.equals(key)) {
                nn.value = value;
                return;
            }
            nn = nn.next;
        }
        Node n = new Node();
        n.key = key;
        n.value = value;
        nn = buckt.get(idx);
        n.next = nn;
        buckt.set(idx, n);
        size++;

        //re-hashing
        double thf = 2.0;       //threshold factor
        double lf = (1.0 * size) / buckt.size();      //load factor
        if (lf > thf) {
            reHashing();
        }
    }

    private void reHashing() {
        ArrayList<Node> newBuckt = new ArrayList<>();
        for (int i = 0; i < 2 * buckt.size(); i++) {
            newBuckt.add(null);
        }
        ArrayList<Node> temp = buckt;
        buckt = newBuckt;
        size = 0;
        for (Node t : temp) {
            while (t != null) {
                put(t.key, t.value);
                t = t.next;
            }
        }

    }

    public boolean containsKey(K key) {
        int idx = hashFun(key);
        Node nn = buckt.get(idx);
        while (nn != null) {
            if (nn.key.equals(key)) {
                return true;
            }
            nn = nn.next;
        }
        return false;
    }

    public V get(K key) {
        int idx = hashFun(key);
        Node nn = buckt.get(idx);
        while (nn != null) {
            if (nn.key.equals(key)) {
                return nn.value;
            }
            nn = nn.next;
        }
        return null;
    }

    public V remove(K key) {
        int idx = hashFun(key);
        Node curr = buckt.get(idx);
        Node prev = null;
        while (curr != null) {
            if (curr.key.equals(key)) {
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        if (curr == null)
            return null;
        else if (prev == null) {
            buckt.set(idx, curr.next);
        } else {
            prev.next = curr.next;
        }
        curr.next = null;
        size--;
        return curr.value;
    }

    @Override
    public String toString() {
        String s = "{";
        for (Node t : buckt){
            while (t!=null){
                s = s + t.key+ " = "+t.value+ ", ";
                t = t.next;
            }
        }
        return s + "}";

    }

    public int hashFun(K key) {
        int idx = key.hashCode();
        idx = idx % buckt.size();
        if (idx < 0) {
            idx += buckt.size();
        }
        return idx;
    }
}
