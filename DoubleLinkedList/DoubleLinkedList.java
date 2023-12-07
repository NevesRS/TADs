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

    public void remove(int index) {
        if (index == 0) {
            header.next = header.next.next;
        } else if (index == count) {
            trailer.prev = trailer.prev.prev;
        } else {
            if (index >= count / 2) {
                Node aux = trailer.prev;
                for (int i = count; i >= count / 2; i--) {
                    if (i == index) {
                        aux.next = aux.next.next;
                        aux.prev = aux.prev.prev;
                    }
                    aux = aux.prev;
                }
            } else {
                Node aux = header.next;
                for (int i = 0; i <= count / 2; i++) {
                    if (i == index) {
                        aux.next.prev = aux.prev;
                        aux.prev.next = aux.next;
                    }
                    aux = aux.next;
                }
            }
        }
        count--;
    }

    public int get(int index) {
        if (index == count - 1) {
            return trailer.prev.element;
        } else {
            Node aux = header.next;
            for (int i = 0; i < count - 1; i++) {
                if (i == index) {
                    return aux.element;
                }
                aux = aux.next;
            }
        }
        return -1;
    }

    public void escrevePrev() {
        Node aux = trailer.prev;
        for (int i = 0; i <= count; i++) {
            if (aux != null) {
                System.out.println(aux.element);
                aux = aux.prev;
            }
        }
    }

    public void escreveNext() {
        Node aux = header.next;
        for (int i = 0; i <= count; i++) {
            if (aux != null) {
                System.out.println(aux.element);
                aux = aux.next;
            }
        }
    }
}
