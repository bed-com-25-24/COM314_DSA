public class DDLinkedList<E> implements List<E> {
    private DLinkNode<E> head, tail, curr;
    private int count;
    public DDLinkedList() {
         head = tail = curr = null; 
         count = 0;
          }
    public void clear() { 
        head = tail = curr = null; 
        count = 0; 
        }
    public void setFirst() {
         curr = head; 
         
        }
    public void next() { 
        if (curr != null)
             curr = curr.next();
         }
    public void prev() { 
        if (curr != null) 
            curr = curr.prev();
         }
    public int length() { 
        return count;
         }
    public void setPos(int pos) {
        if (pos < 0 || pos >= count)
            throw new IndexOutOfBoundsException("invalid list position");
            curr = head; 
            for (int i=0; i<pos; i++) 
                curr = curr.next();
    }
    public void setValue(E val) {
         if (curr == null)
            throw new IllegalStateException("invalid list position"); 
            curr.setElement(val);
          }
    public E currValue() {
         if (curr == null)
             throw new IllegalStateException("invalid list position");
             return curr.element();
          }
    public boolean isEmpty() {
         return count == 0; 
         }
    public boolean isInList() { 
        return curr != null;
         }
    public void insert(E item) {
        if (curr == null) { 
            DLinkNode<E> n = new DLinkNode<E>(item, head, null);
            if (head != null)
                head.setPrev(n); 
            else 
                tail = n;
                head = curr = n;
        } else {
            DLinkNode<E> p = curr.prev();
            DLinkNode<E> n = new DLinkNode<E>(item, curr, p);
            curr.setPrev(n);
            if (p != null) 
                p.setNext(n); 
            else
                head = n;
            curr = n;
        }
        count++;
    }
    public E remove() {
        if (curr == null) return null;
        E value = curr.element(); 
        DLinkNode<E> p = curr.prev(), 
        n = curr.next();
        if (p != null)
            p.setNext(n); 
            else head = n;
        if (n != null) 
            n.setPrev(p); 
        else
            tail = p;
            curr = n; 
            count--; 
            return value;
    }
    public void append(E item) {
        DLinkNode<E> n = new DLinkNode<E>(item, null, tail);
        if (tail != null) 
            tail.setNext(n); 
        else head = n;
            tail = n; 
        if (curr == null) 
            curr = n; 
            count++;
    }
}
