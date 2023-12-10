package LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        System.out.println("L1: ");
        l1.add(0);
        l1.add(1);
        l1.escreve();

        System.out.println("L2: ");
        l2.add(2);
        l2.add(3);
        l2.escreve();

        System.out.println("UNINDO: ");
        l1.mergeLists(l2);
        l1.escreve();

        System.out.println("Para array: ");
        l1.escreveArray(l1.toArray());
    }
}
