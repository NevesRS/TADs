package DoubleLinkedList;

public class App {
    public static void main(String[] args) {
        DoubleLinkedList dl = new DoubleLinkedList();
        DoubleLinkedList dl2 = new DoubleLinkedList();
        // dl.add(0);
        // dl.add(1);
        // dl.add(2);
        // dl.add(3);
        // dl.add(4);
        // dl.add(5);
        // dl.add(6);
        // dl.add(7);

        // System.out.println("ANTES:");
        // dl.escreveNext();

        // dl.inverte();

        // System.out.println("DEPOIS:");
        // dl.escreveNext();

        dl.add(0);
        dl.add(1);

        dl2.add(2);
        dl2.add(3);

        dl.mergeLists(dl2);

        System.out.println("NEXT: ");
        dl.escreveNext();

        System.out.println("PREV: ");
        dl.escrevePrev();
    }
}
