package LinkedList;

/**
 * Implementação de pilha utilizando LinkedList
 */
public class LinkedList {

    public Node head;
    public int count;

    public LinkedList() {
        head = new Node(0);
        count = 1;
    }

    public void empilha(int e) {
        Node aux = new Node(e);
        if (count == 1) {
            head = aux;
        } else {
            aux.next = head;
            head = aux;
        }
        count++;
    }

    public void desempilha() {
        if (count > 1) {
            Node aux = head.next;
            head = aux;
            count--;
        } else {
            System.out.println("Não há mais itens a serem desempilhados!");
        }
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
