import java.net.InetAddress;

public class MainTest {

    byte[] a =  new byte[1024 * 100];

    public static void main(String[] args) throws Exception {
//        LoopQueue<Integer> queue = new LoopQueue<Integer>();
//        for (int i = 0; i < 10 ; i++) {
//            queue.enqueue(i);
//            System.out.println(queue);
//            if (i % 3 == 2) {
//                queue.dequeue();
//                System.out.println(queue);
//            }
//        }
        InetAddress localHost = InetAddress.getLocalHost();
        String hostAddress = localHost.getHostAddress();
        System.out.println(localHost);
        System.out.println(hostAddress);

    }
}
