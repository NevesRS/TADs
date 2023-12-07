package DoubleLinkedList;

public class DoubleLinkedList {
    public Node header;
    public Node trailer;
    public int count;

    public DoubleLinkedList() {
        header = new Node(0);
        trailer = new Node(0);
        count = 0;
    }

    public void add(int e) {
        Node newNode = new Node(e);
        if (count == 0) {
            header.next = newNode;
            trailer.prev = newNode;
        } else {
            newNode.prev = trailer.prev;
            newNode.next = trailer.prev.next;
            trailer.prev.next = newNode;
            trailer.prev = newNode;
        }
        count++;
    }

    public void imprimePrev() {
        Node aux = trailer.prev;
        for (int i = 0; i < count; i++) {
            if (aux != null) {
                System.out.println(aux.element);
                aux = aux.prev;
            }
        }
    }

    public void imprimeNext() {
        Node aux = header.next;
        for (int i = 0; i < count; i++) {
            if (aux != null) {
                System.out.println(aux.element);
                aux = aux.next;
            }
        }
    }

    public int get(int index) {
        if (index == count - 1) {
            return trailer.prev.element;
        } else {
            Node aux = header.next;
            for (int i = 0; i < count; i++) {
                if (i == index) {
                    return aux.element;
                }
                aux = aux.next;
            }
        }
        return -1;
    }
}
