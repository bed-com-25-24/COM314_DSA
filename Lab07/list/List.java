public interface List<E> {
    void clear();
    void setFirst();
    void next();
    void prev();
    int length();
    void setPos(int pos);
    void setValue(E val);
    E currValue();
    boolean isEmpty();
    boolean isInList();
    void insert(E item);
    E remove();
    void append(E item);
}
