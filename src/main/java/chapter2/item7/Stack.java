package chapter2.item7;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    // The objects that were popped off the stack won't be gargabe collected.
    // The stack maintains obsolet references to these objects
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    public static void main(String args[]) {
        Stack stackObjects = new Stack();
        for(int i=0; i<Integer.MAX_VALUE; i++) {
            stackObjects.push(new BigDecimal(i));
            stackObjects.pop();
        }
    }
}
