
public class ArrayStack<E> implements Stack<E> {
    private static final
     int DEFAULT_SIZE = 10;
    private E[] array;
    private int size, top;
    @SuppressWarnings("unchecked")
    public ArrayStack() {
         size = DEFAULT_SIZE;
         top = 0; 
         array = (E[]) new Object[size];
          }
    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
         size = Math.max(1, capacity); 
         top = 0; 
         array = (E[]) new Object[size];
          }
    public void clear() { 
        for (int i=0;i<top;i++) 
        array[i]=null; 
        top=0;
         }
    @SuppressWarnings("unchecked")
    private void grow() {
        size *= 2; 
        E[] bigger = (E[]) new Object[size];
        for (int i=0;i<top;i++) 
        bigger[i]=array[i];
        array=bigger;
    }
    public void push(E element) { 
        if (top == size) 
            grow(); 
        array[top++] = element;
         }
    public E pop() {
        if (isEmpty()) throw new IllegalStateException("Empty stack");
        E value = array[--top]; 
        array[top]=null; 
        return value;
    }
    public boolean isEmpty() { 
        return top == 0;
         }
}
