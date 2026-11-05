public interface Queue<E> {
    void clear();
    void enqueue(E element);
    E dequeue();
    int length();
}
