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
        System.out.println("DEPOIS DE DESEMPILHAR:");
        int indice = 0;
        l.desempilha();
        System.out.println("índice: "+indice+" = ["+l.get(indice)+"]"  );
        l.desempilha();
        System.out.println("índice: "+indice+" = ["+l.get(indice)+"]"  );
        // l.escreve();
    }
}
