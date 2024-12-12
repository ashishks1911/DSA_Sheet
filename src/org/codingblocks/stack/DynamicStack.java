package org.codingblocks.stack;

public class DynamicStack extends Stack {
    @Override
    public void push(int item) throws Exception {
        if (isFull()) {
            int[] newArray = new int[2 * arr.length];
            for (int i = 0; i < arr.length; i++) {
                newArray[i] = arr[i];
            }
            arr = newArray;
        }
        super.push(item);
    }

}
