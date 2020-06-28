package stack;

import linkedList.LinkedList;

/**
 * @program: dataStructure
 * @description:
 * @author: liuyi@segimail.com
 * @create: 2020-06-28 15:41
 **/
public class LinkedListStack<E> implements Stack<E> {

    private LinkedList<E> list;

    public LinkedListStack() {
        list = new LinkedList<>();
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E peek() {
        return list.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.getSize(); i++) {
            builder.append(list.get(i));
            if (i != list.getSize() -1)
                builder.append(", ");
        }
        return "Stack:" +
                "{" + builder.toString() +
                "} Top" ;
    }
}
