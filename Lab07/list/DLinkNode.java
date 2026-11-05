public class DLinkNode<E> {
    private E element;
    private DLinkNode<E> next;
    private DLinkNode<E> prev;

    public DLinkNode(E elem, DLinkNode<E> nxt, DLinkNode<E> prv) {
        element = elem; next = nxt; prev = prv;
    }
    public DLinkNode<E> next() {
         return next;
          }
    public DLinkNode<E> prev() {
         return prev; 
         }
    public E element() {
         return element; 
         }
    public void setNext(DLinkNode<E> nxt) {
         next = nxt; 
         }
    public void setPrev(DLinkNode<E> prv) {
         prev = prv;
          }
    public void setElement(E elem) {
         element = elem; 
         }
}
