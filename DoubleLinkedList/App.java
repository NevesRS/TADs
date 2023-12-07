package DoubleLinkedList;

public class App {
    public static void main(String[] args) {
        DoubleLinkedList dl = new DoubleLinkedList();

        dl.add(0); //1
        dl.add(1); //2
        dl.add(2); //3
        dl.add(3); //4
        dl.add(4); //5
        dl.add(5); //6

        System.out.println(dl.get(6));
    }
}
