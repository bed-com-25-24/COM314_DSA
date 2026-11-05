public class LinkNode<E> {
    private E element;
    private LinkNode<E> next;
    public LinkNode(E elem, LinkNode<E> nextNode) {
         element = elem; next = nextNode; 
         }
    public LinkNode(LinkNode<E> nextNode) {
         next = nextNode; 
         }
    public LinkNode<E> next() {
         return next;
          }
    public LinkNode<E> setNext(LinkNode<E> n) { 
        next = n; return next;
         }
    public E element() {
         return element;
          }
    public E setElement(E e) {
         element = e; return element;
         
          }
}
