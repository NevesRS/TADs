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
            trailer.prev.next = newNode;
            newNode.prev = trailer.prev;
            newNode.next = trailer;
            trailer.prev = newNode;
        }
        count++;
    }

    public void remove(int index) {
        if (index == 0) {
            header.next = header.next.next;
            header.next.prev = header;
        } else if (index == count - 1) {
            System.out.println(trailer.prev.element);
            System.out.println(trailer.prev.prev.element);
        } else {
            if (index >= count / 2) {// começa pelo trailer
                Node aux = trailer.prev;
                for (int i = 0; i < count - index; i++) {
                    if (i == (count - index) - 1) {
                        aux.prev.next = aux.next;
                        aux.next.prev = aux.prev;
                    }
                    aux = aux.prev;
                }
            } else {
                Node aux = header.next;
                for (int i = 0; i < count / 2; i++) {
                    if (i == index) {
                        aux.prev.next = aux.next;
                        aux.next.prev = aux.prev;
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

    public void inverte() {
        Node aux1 = header.next;
        Node aux2 = trailer.prev;
        Integer elem = null;
        for (int i = 0; i < count / 2; i++) {
            elem = aux2.element;
            aux2.element = aux1.element;
            aux1.element = elem;
            aux1 = aux1.next;
            aux2 = aux2.prev;
        }
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
