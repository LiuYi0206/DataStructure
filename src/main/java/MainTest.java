import linkedList.LinkedList;
import queue.ArrayQueue;
import queue.LoopQueue;
import queue.Queue;

import java.util.Random;

public class MainTest {

    byte[] a =  new byte[1024 * 100];

    public static void main(String[] args) throws Exception {
        String aa = "删除失败,该会议室状态不为停用状态!";
        System.out.println(aa);

    }

    public static void test3() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedList.addFirst(i);
            System.out.println(linkedList);
        }
        linkedList.add(3,1111);
        System.out.println(linkedList);
    }

    private static void test2() {
        int opCount = 100000;
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        double time1 = testQueue(arrayQueue, opCount);
        System.out.println("arrayQueue" + time1);
        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        double time2 = testQueue(loopQueue, opCount);
        System.out.println("loopQueue" + time2);
    }

    private static double testQueue(Queue<Integer> q, int opCount) {
        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCount; i++) {
            q.dequeue();
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }

    private static void test1() {
        LoopQueue<Integer> queue = new LoopQueue<Integer>();
        for (int i = 0; i < 10 ; i++) {
            queue.enqueue(i);
            System.out.println(queue);
            if (i % 3 == 2) {
                System.out.println(queue.dequeue());
                System.out.println(queue);
            }
        }
    }
}
