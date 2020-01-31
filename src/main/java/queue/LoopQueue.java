package queue;

public class LoopQueue<E> implements Queue<E> {

    private E[] data;

    private int front, tail;

    private int size;

    public LoopQueue(int capacity) {
        data = (E[]) new Object[capacity + 1];
        front = 0;
        tail = 0;
        size = 0;
    }

    public LoopQueue() {
        this(10);
    }

    public int getCapacoty() {
        return data.length - 1;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return front == tail;
    }

    public void enqueue(E e) {
        if ((tail + 1) % data.length == front) {
            resize(getCapacoty() * 2);
        }

        data[tail] = e;
        tail = (tail + 1) % data.length;
        size ++;
    }

    private void resize(int newCapacoty) {
        E[] newData = (E[]) new Object[newCapacoty + 1];

        for (int i = 0; i < size ; i++) {
            newData[i] = data[(i + front) % data.length];
        }
        data = newData;
        front = 0;
        tail = size;
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Cannot dequeue. from an empty queue.");
        }

        E ret = data[front];
        data [front] = null;
        front = (front + 1) % data.length;
        size --;
        if (size == getCapacoty() / 4 && getCapacoty() / 2 != 0) {
            resize(getCapacoty() / 2);
        }
        return ret;
    }

    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is empty.");
        }
        return data[front];
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = front; i != tail; i = (i +1) % data.length) {
            builder.append(data[i]);
            if ((i + 1) % data.length != tail)
                builder.append(", ");
        }
        return "Queue:" +
                "capacity=" + getCapacoty() +
                ", size=" + size +
                ", data={" + builder.toString() +
                '}' ;
    }
}
