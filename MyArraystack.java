public class MyArraystack implements Mystack {
    private int[] array;
    private int SIZE;
    private int topIndex;

    MyArraystack(int size) {
        SIZE = size;
        array = new int[SIZE];
        topIndex = -1;

    }

    public boolean push(int value) {
        if (!isFull()) {
            topIndex++;
            array[topIndex] = value;
            return true;
        }

        return false;
    }

    public int pop() {
        if (!isEmpty()) {
            int value = array[topIndex];
            topIndex--;
            return value;
        }
        return -1;
    }

    public boolean isFull() {
        return topIndex == SIZE - 1;

    }

    public void in() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
        } else {
            for (int i = 0; i <= topIndex; i++) {
                System.out.println(array[i] + " ");
                System.out.println();
            }
        }

    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }
}