package Pilha;

/**
 * Implementação de pilha
 */
public class Pilha {

    public Node head;
    public int count;

    public Pilha() {
        head = new Node(0);
        count = 0;
    }

    public void empilha(int e) {
        Node newNode = new Node(e);
        if (count == 0) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        count++;
    }

    public void desempilha() {
        if (count > 1) {
            Node newNode = head.next;
            head = newNode;
            count--;
        } else {
            System.out.println("Não há mais itens a serem desempilhados!");
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
