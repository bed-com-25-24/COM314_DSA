
public class ArrayQueue<E> implements Queue<E> {
    private static final int DEFAULT_SIZE = 10;
    private E[] array;
    private int front, rear, count;
    private int size;
    @SuppressWarnings("unchecked")
    public ArrayQueue() {
         size=DEFAULT_SIZE; 
         array=(E[])new Object[size]; 
         front=rear=count=0; 
         }
    @SuppressWarnings("unchecked")
    public ArrayQueue(int capacity) {
         size=Math.max(1,capacity); 
         array=(E[])new Object[size]; 
         front=rear=count=0;
          }
    public void clear() {
         for(int i=0;i<size;i++) 
            array[i]=null; 
            front=rear=count=0;
          }
    @SuppressWarnings("unchecked")
    private void grow() {
        int newSize=size*2; 
        E[] bigger=(E[])new Object[newSize];
        for(int i=0;i<count;i++)
            bigger[i]=array[(front+i)%size];
        array=bigger; size=newSize; front=0; 
        rear=count;
    }
    public void enqueue(E element) {
        if(count==size) grow();
        array[rear]=element; 
        rear=(rear+1)%size; 
        count++;
    }
    public E dequeue() {
        if(count==0) 
        return null;
        E value=array[front];
        array[front]=null; 
        front=(front+1)%size; 
        count--; 
        return value;
    }
    public int length() { 
        return count; 
        }
}

