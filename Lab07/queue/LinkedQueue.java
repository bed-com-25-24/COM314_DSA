
public class LinkedQueue<E> implements Queue<E> {
    private LinkNode<E> front, rear;
    private int count;
    public LinkedQueue() {
         front = rear = null; 
         count = 0; 
         }
    public void clear() { 
        front = rear = null; 
        count = 0; 
    }
    public void enqueue(E element) {
        LinkNode<E> n = new LinkNode<E>(element, null);
        if (rear == null) 
            front = rear = n;
        else {
            rear.setNext(n); 
            rear = n;
        }
        count++;
    }
    public E dequeue() {
        if (front == null)
            return null;
        E value = front.element(); 
            front = front.next();
        if (front == null) 
            rear = null;
        count--; 
            return value;
    }
    public int length() { 
        return count;
        
        
 }
}
