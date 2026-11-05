
public class LinkedStack<E> implements Stack<E> {
    private LinkNode<E> top;
    public LinkedStack() {
         top = null;
          }
    public void clear() {
         top = null;
          }
    public void push(E element) {
         top = new LinkNode<E>(element, top);
          }
    public E pop() {
        if (isEmpty()) throw new IllegalStateException("Empty stack");
        E value = top.element(); 
        top = top.next(); 
        return value;
    }
    public boolean isEmpty() {
         return top == null;
          }
}
