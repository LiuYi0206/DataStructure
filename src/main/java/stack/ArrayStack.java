package stack;

import array.Array;

public class ArrayStack<E> implements Stack<E> {

    Array<E> array;

    public ArrayStack (int capacity) {
        array = new Array<E>(capacity);
    }

    public ArrayStack () {
        array = new Array<E>();
    }

    public int getSize() {
        return array.getSize();
    }

    public boolean isEmpty() {
        return array.isEmpty();
    }

    public void push(E e) {
        array.addLast(e);
    }

    public E pop() {
        return array.removeLast();
    }

    public E peek() {
        return array.getLast();
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.getSize(); i++) {
            builder.append(array.get(i));
            if (i != array.getSize() -1)
                builder.append(", ");
        }
        return "Stack:" +
                "{" + builder.toString() +
                "} Top" ;
    }

}
