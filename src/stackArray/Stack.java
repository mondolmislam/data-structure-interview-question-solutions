package stackArray;

/**
 *
 * @author maidul
 */
public class Stack<T> {

    private T[] stack;
    private int numOfItems;

    public Stack() {
        this.stack = (T[]) new Object[1];
    }

    public void push(T newData) {
        if (numOfItems == this.stack.length) {
            resize(2 * this.stack.length);
        }
        this.stack[numOfItems++] = newData;
    }

    public void display() {
        for (T t : this.stack) {
            if (t != null) {
                System.out.println(t);
            }
        }
    }

    public T pop() {
        T itemToPop = this.stack[--numOfItems];
        if (numOfItems > 0 && numOfItems == this.stack.length / 4) {
            resize(this.stack.length / 2);
        }
        return itemToPop;
    }

    private void resize(int capacity) {
        T[] stackCopy = (T[]) new Object[capacity];
        for (int i = 0; i < numOfItems; i++) {
            stackCopy[i] = this.stack[i];
        }
        this.stack = stackCopy;
    }

    public boolean isEmpty() {
        return this.numOfItems == 0;
    }

    public int size() {
        return this.numOfItems;
    }

}
