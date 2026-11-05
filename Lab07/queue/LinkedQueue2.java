
public class LinkedQueue2<E> implements Queue<E> {
    private DLinkNode<E> rear, front;
    private int count;
    public LinkedQueue2() {
         rear = front = null; count = 0;
          }
    public void clear() { 
        rear = front = null; count = 0; 
    }
    public void enqueue(E element) {
        DLinkNode<E> n = new DLinkNode<E>(element, rear, null);
        if (rear != null) rear.setPrev(n); else front = n;
        rear = n; count++;
    }
    public E dequeue() {
        if (front == null) return null;
        E value = front.element(); front = front.prev();
        if (front == null) rear = null; else front.setNext(null);
        count--; return value;
    }
    public int length() {
         return count;
          }
}
