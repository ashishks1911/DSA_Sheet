package org.codingblocks.queue;

public class DynamicQueue extends CircularQueue {
    @Override
    public void Enqueue(int item) throws Exception {
        if (isFull()) {
            int[] newArray = new int[2 * arr.length];
            for (int i = 0; i < arr.length; i++) {
                newArray[i] = arr[i];
            }
            arr = newArray;
        }
        super.Enqueue(item);
    }
}
