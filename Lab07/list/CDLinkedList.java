
public class CDLinkedList<E> implements List<E> {
    private DLinkNode<E> head, tail, curr;
    private int count;
    public CDLinkedList() { head = tail = curr = null; count = 0; }
    public void clear() { head = tail = curr = null; count = 0; }
    public void setFirst() { curr = head; }
    public void next() { if (curr != null) curr = curr.next(); }
    public void prev() { if (curr != null) curr = curr.prev(); }
    public int length() { return count; }
    public void setPos(int pos) {
        if (pos < 0 || pos >= count) throw new IndexOutOfBoundsException("invalid list position");
        curr = head; for (int i=0; i<pos; i++) curr = curr.next();
    }
    public void setValue(E val) { if (curr == null) throw new IllegalStateException("invalid list position"); curr.setElement(val); }
    public E currValue() { if (curr == null) throw new IllegalStateException("invalid list position"); return curr.element(); }
    public boolean isEmpty() { return count == 0; }
    public boolean isInList() { return curr != null; }
    public void insert(E item) {
        if (count == 0) {
            DLinkNode<E> n = new DLinkNode<E>(item, null, null);
            n.setNext(n); n.setPrev(n); head = tail = curr = n;
        } else {
            DLinkNode<E> p = curr.prev();
            DLinkNode<E> n = new DLinkNode<E>(item, curr, p);
            p.setNext(n); curr.setPrev(n);
            if (curr == head) 
            head = n;
            curr = n;
        }
        count++;
    }
    public E remove() {
        if (curr == null) return null;
        E value = curr.element();
        if (count == 1) {
             clear(); return value;
              }
        DLinkNode<E> p = curr.prev(), 
        n = curr.next();
        p.setNext(n); 
        n.setPrev(p);
        if (curr == head) 
            head = n;
        if (curr == tail) 
            tail = p;
        curr = n; count--; 
            return value;
    }
    public void append(E item) {
        if (count == 0) {
             insert(item);
              return; 
              }
        DLinkNode<E> n = new DLinkNode<E>(item, head, tail);
        tail.setNext(n); head.setPrev(n); tail = n; count++;
    }
}
