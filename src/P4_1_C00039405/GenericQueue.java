package P4_1_C00039405;

/**
 * @author Y. Daniel Liang
 */
public class GenericQueue<E> {

    private java.util.LinkedList<E> list
            = new java.util.LinkedList<E>();

    public void enqueue(E e) {
        list.addLast(e);
    }

    public E dequeue() {
        return list.removeFirst();
    }

    public int getSize() {
        return list.size();
    }

    @Override
    public String toString() {
        return "Queue: " + list.toString();
    }
}
