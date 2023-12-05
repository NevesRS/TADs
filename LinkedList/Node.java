package LinkedList;

public class Node {
    public int element;
    public Node next;

    public Node(int e){
        element = e;
        next = null;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
