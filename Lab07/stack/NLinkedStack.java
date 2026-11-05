
public class NLinkedStack<E> implements Stack<E> {
    private LinkNode<E> head, top;
    public NLinkedStack() {
         head = top = null;
          }
    public void clear() {
         head = top = null;
          }
    public void push(E element) {
        LinkNode<E> n = new LinkNode<E>(element, null);
        if (head == null) 
        head = top = n;
        else {
            top.setNext(n); 
            top = n; 
        }
    }
    public E pop() {
        if (isEmpty()) throw new IllegalStateException("Empty stack");
        E value = top.element();
        if (head == top) 
            head = top = null;
        else {
            LinkNode<E> p = head;
            while (p.next() != top) 
                p = p.next();
                p.setNext(null); 
                top = p;
        }
        return value;
    }
    public boolean isEmpty() {
         return top == null; 
         }
}
