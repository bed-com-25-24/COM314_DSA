
public class DLinkedList<E> implements List<E> {
    private DLinkNode<E> head, tail, curr;
    private int count;
    public DLinkedList() {
         head = new DLinkNode<E>(null, null, null); tail = curr = head; count = 0;
          }
    public void clear() {
         head.setNext(null); tail = curr = head; count = 0;
          }
    public void setFirst() { 
        curr = head;
         }
    public void next() {
         if (curr != null && curr.next() != null) curr = curr.next(); 
         }
    public void prev() {
         if (curr == null || curr == head) { curr = null; return;
          } 
          curr = curr.prev(); 
     }
    public int length() { 
        return count;
         }
    public void setPos(int pos) {
        if (pos < 0 || pos >= count) throw new IndexOutOfBoundsException("invalid list position");
        curr = head; for (int i=0; i<pos; i++) curr = curr.next();
    }
    public void setValue(E val) { 
        if (!isInList()) throw new IllegalStateException("invalid list position"); curr.next().setElement(val); 
        }
    public E currValue() {
         if (!isInList()) throw new IllegalStateException("invalid list position"); return curr.next().element(); 
         }
    public boolean isEmpty() {
         return count == 0; 
         }
    public boolean isInList() {
         return curr != null && curr.next() != null; 
         }
    public void insert(E item) {
        if (curr == null) throw new IllegalStateException("invalid list position");
        DLinkNode<E> n = new DLinkNode<E>(item, curr.next(), curr);
        if (curr.next() != null) curr.next().setPrev(n); else tail = n;
        curr.setNext(n); count++;
    }
    public E remove() {
        if (!isInList()) return null;
        DLinkNode<E> old = curr.next();
        curr.setNext(old.next());
        if (old.next() != null) old.next().setPrev(curr); else tail = curr;
        count--; return old.element();
    }
    public void append(E item) {
        DLinkNode<E> n = new DLinkNode<E>(item, null, tail);
        tail.setNext(n); tail = n; count++;
    }
}
