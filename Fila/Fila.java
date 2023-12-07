package Fila;

public class Fila {
    public Node head;
    public Node tail;
    public int count;

    public Fila() {
        head = new Node(0);
        tail = new Node(0);
        count = 0;
    }

    public void add(int e) {
        Node newNode = new Node(e);
        if (count == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        count++;
    }

    public void remove() {
        if (count > 1) {
            Node aux = head;
            for (int i = 0; i < count - 2; i++) {
                aux = aux.next;
            }
            aux.next = null;
            count--;
        }else{
            System.out.println("Não há mais itens a serem excluidos!");
        }

    }

    public int get(int index) {
        Node aux = head;
        for (int i = 0; i <= count; i++) {
            if (aux != null) {
                if (i == index) {
                    return aux.element;
                }
                aux = aux.next;
            }
        }
        return -1;
    }

    public void escreve() {
        Node aux = head;
        for (int i = 0; i <= count; i++) {
            if (aux != null) {
                System.out.println(aux.element);
                aux = aux.next;
            }
        }
    }
}
