package linkedList;

/**
 * @program: dataStructure
 * @description: 链表
 * @author: liuyi@segimail.com
 * @create: 2020-05-12 17:18
 **/
public class LinkedList<E> {

    private class Node {
        public E e;
        public Node next;

        public  Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node head;

    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(E e) {
        head = new Node(e, head);
        size++;
    }


}
