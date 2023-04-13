public class MyLinkedList <E> {
    private int size;
    private Node head;
    class Node {
        public E element;
        public Node next;
        public Node(E element) {
            this.element = element;
            this.next = null;
        }
    }

    //MyLinkedList
    private Node getNode(int index) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("Ай яй какой плохой мальчик :) !!! ");
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public MyLinkedList() {
        size = 0;
        head = null;
    }

    public void add(E element) {
        if (head == null && size == 0) {
            head = new Node(element);
            size++;
        } else {
            getNode(size - 1).next = new Node(element);
            size++;
        }
    }

    public void add(E element, int index) {
        if (index == 0) {
            add(element);
        }
        else {
            Node node = new Node(element);
            node.next = getNode(index - 1).next;
            getNode(index - 1).next = node;
        }
    }
    public E get(int index) {
        Node node = getNode(index);
        return node.element;
    }

    public boolean remove(int index) {
         if (index == 0 && head.next == null) {
             head = null;
             size--;
             return true;
         }
         else if (index == 0) {
             head = head.next;
             size--;
             return true;
         }
         else if (getNode(index).next == null) {

             getNode(index - 1).next = null;
             size--;
             return true;
         }
         else {
             getNode(index - 1).next = getNode(index).next;
             size--;
             return true;
         }
    }
    public boolean contains(int index){
         try {
             get(index);
         }catch (NullPointerException e){
             return  false;
         }
         return true;
    }
}
