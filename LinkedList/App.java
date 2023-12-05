package LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.empilha(1);
        l.empilha(2);
        l.empilha(3);
        l.empilha(4);
        l.empilha(5);
        l.escreve();
        l.desempilha();
        l.desempilha();
        l.desempilha();
        l.desempilha();
        System.out.println("DEPOIS DE DESEMPILHAR:");
        l.escreve();
    }
}
