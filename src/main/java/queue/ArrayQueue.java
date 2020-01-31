package queue;

import array.Array;

public class ArrayQueue<E> implements Queue<E> {

    Array<E> array;

    public ArrayQueue(int capacity) {
        array = new Array<E>(capacity);
    }

    public ArrayQueue() {
        array = new Array<E>();
    }

    public int getSize() {
        return array.getSize();
    }

    public boolean isEmpty() {
        return array.isEmpty() ;
    }

    public int getCapacoty() {
        return array.getCapacity();
    }

    public void enqueue(E e) {
        array.addLast(e);
    }

    public E dequeue() {
        return array.removeFirst();
    }

    public E getFront() {
        return array.getFirst() ;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.getSize(); i++) {
            builder.append(array.get(i));
            if (i != array.getSize() -1)
                builder.append(", ");
        }

        return "Queue:" +
                "front {" + builder.toString() +
                "} tail" ;
    }
}
