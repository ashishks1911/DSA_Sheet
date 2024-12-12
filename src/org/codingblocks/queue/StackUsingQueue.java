package org.codingblocks.queue;

public class StackUsingQueue {
    public static void main(String[] args) throws Exception {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
    private DynamicQueue Q;

    public StackUsingQueue() {
        Q = new DynamicQueue();
    }
    public int size(){
        return Q.size();
    }
    public boolean isEmpty(){
        return Q.isEmpty();
    }
    public void push(int item) throws Exception {
        Q.Enqueue(item);
    }
    public int pop() throws Exception {
        DynamicQueue helper = new DynamicQueue();
        while (Q.size()>1){
            helper.Enqueue(Q.Dequeue());
        }
        int rv = Q.Dequeue();
        while (helper.size()>0){
            Q.Enqueue(helper.Dequeue());
        }
        return rv;
    }
    public int peek() throws Exception {
        DynamicQueue helper = new DynamicQueue();
        while (Q.size()>1){
            helper.Enqueue(Q.Dequeue());
        }
        int rv = Q.Dequeue();
        Q.Enqueue(rv);
        while (helper.size()>0){
            Q.Enqueue(helper.Dequeue());
        }
        return rv;
    }
}
