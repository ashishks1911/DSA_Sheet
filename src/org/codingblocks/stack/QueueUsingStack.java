package org.codingblocks.stack;

public class QueueUsingStack {
    private DynamicStack st;
    public QueueUsingStack() {
        st = new DynamicStack();
    }
    public int size(){
        return st.size();
    }
    public boolean isEmpty(){
        return st.isEmpty();
    }
    public void Enqueue(int item) throws Exception {
        Stack helper = new Stack();
        while (!st.isEmpty()){
            helper.push(st.pop());
        }
        st.push(item);
        while (!helper.isEmpty()){
            st.push(helper.pop());
        }
    }

    public int Dequeue() throws Exception {
        return st.pop();
    }
    public int getFront() throws Exception {
        return st.peek();
    }

    public static void main(String[] args) throws Exception {
        QueueUsingStack queue = new QueueUsingStack();
        queue.Enqueue(10);
        queue.Enqueue(20);
        queue.Enqueue(30);
        queue.Enqueue(40);
        queue.Enqueue(50);
        queue.Enqueue(60);
        System.out.println(queue.Dequeue());
        System.out.println(queue.getFront());
    }
}
