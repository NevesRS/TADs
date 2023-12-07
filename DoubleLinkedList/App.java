package DoubleLinkedList;

public class App {
    public static void main(String[] args) {
        DoubleLinkedList dl = new DoubleLinkedList();

        dl.add(0); 
        dl.add(1); 
        dl.add(2); 
        dl.add(3); 
        dl.add(4); 
        dl.add(5); 
        dl.add(6);
        dl.add(7);

        dl.remove(4);
        System.out.println("NEXT:");
        dl.escreveNext();
        System.out.println("PREV:");
        dl.escrevePrev();
    }
}
