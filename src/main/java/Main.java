import queue.ArrayQueue;

public class Main {
    public static void main(String[] args) {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<Integer>();
        for (int i = 0; i < 10 ; i++) {
            arrayQueue.enqueue(i);
            System.out.println(arrayQueue);
            if (i % 3 == 2) {
                arrayQueue.dequeue();
                System.out.println(arrayQueue);
            }
        }
    }
}
